package lk.ijse.gdse68.employeeservice.dao;

import lk.ijse.gdse68.employeeservice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 #* @author : sachini apsara
 #* @date : 2024-03-11
 #**/
@Repository
public interface EmployeeDAO extends JpaRepository<EmployeeEntity,String> {
}
