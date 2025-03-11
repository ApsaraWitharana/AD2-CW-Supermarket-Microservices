package lk.ijse.gdse68.employeeservice.service;

import jakarta.transaction.Transactional;
import lk.ijse.gdse68.employeeservice.dao.EmployeeDAO;
import lk.ijse.gdse68.employeeservice.dto.EmployeeDTO;
import lk.ijse.gdse68.employeeservice.entity.EmployeeEntity;
import lk.ijse.gdse68.employeeservice.exception.DataPersistFailedException;
import lk.ijse.gdse68.employeeservice.exception.EmployeeNotFoundException;
import lk.ijse.gdse68.employeeservice.util.Mapping;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/

@Service
@Transactional
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final Mapping mapping;
    private final EmployeeDAO employeeDAO;

    @Override
    public void save(EmployeeDTO dto) {
        EmployeeEntity saveEmployee = Optional.ofNullable(employeeDAO.save(mapping.convertToEntity(dto)))
                .orElseThrow(() -> new DataPersistFailedException("Failed to save employee data!"));
    }

    @Override
    public void delete(String id) {
        if (employeeDAO.existsById(id)) {
            employeeDAO.deleteById(id);
        } else {
            throw new EmployeeNotFoundException("Employee not found for deletion!");
        }
    }

    @Override
    public void update(String id, EmployeeDTO dto) {
        EmployeeEntity entity = employeeDAO.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found for update!"));

        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());
        employeeDAO.save(entity);
    }

    @Override
    public EmployeeDTO get(String id) {
        EmployeeEntity entity = employeeDAO.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found!"));
        return mapping.convertToDTO(entity);
    }

    @Override
    public List<EmployeeDTO> getAll() {
        return employeeDAO.findAll()
                .stream()
                .map(mapping::convertToDTO)
                .collect(Collectors.toList());
    }
}
