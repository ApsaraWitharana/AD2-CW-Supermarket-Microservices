package lk.ijse.gdse68.employeeservice.exception;

/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException() {
        super();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public EmployeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
