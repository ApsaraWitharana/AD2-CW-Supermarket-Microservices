package lk.ijse.gdse68.employeeservice.util;

import lk.ijse.gdse68.employeeservice.dto.EmployeeDTO;
import lk.ijse.gdse68.employeeservice.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/

@Component
public class Mapping {

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeDTO convertToDTO(EmployeeEntity entity) {
        return new EmployeeDTO(
                entity.getId(), // Map entity's 'id' to DTO's 'employeeId'
                entity.getName(),
                entity.getAddress(),
                entity.getEmail()
        );
    }

    public EmployeeEntity convertToEntity(EmployeeDTO dto) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setId(dto.getEmployeeId()); // Map DTO's 'employeeId' to entity's 'id'
        entity.setName(dto.getName());
        entity.setAddress(dto.getAddress());
        entity.setEmail(dto.getEmail());
        return entity;
    }

}
