package lk.ijse.gdse68.employeeservice.controller;

import lk.ijse.gdse68.employeeservice.dto.EmployeeDTO;
import lk.ijse.gdse68.employeeservice.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/

@RestController
@RequestMapping("api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees() {
        List<EmployeeDTO> employees = employeeService.getAll();
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        employeeService.save(employeeDTO);
        return ResponseEntity.status(201).body("Employee saved successfully!");
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable String id, @RequestBody EmployeeDTO employeeDTO) throws ClassNotFoundException {
        employeeService.update(id, employeeDTO);
        return ResponseEntity.ok("Employee updated successfully!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable String id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Employee deleted successfully!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable String id) {
        EmployeeDTO employee = employeeService.get(id);
        return ResponseEntity.ok(employee);
    }
}
