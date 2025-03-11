package lk.ijse.gdse68.employeeservice.dto;

import lk.ijse.gdse68.employeeservice.customObj.EmployeeResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements EmployeeResponse, SuperDTO {
    private String employeeId;
    private String name;
    private String address;
    private String email;
}