package lk.ijse.gdse68.employeeservice.customObj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeErrorResponse implements EmployeeResponse{

    private int errorCode;
    private String errorMassage;

}
