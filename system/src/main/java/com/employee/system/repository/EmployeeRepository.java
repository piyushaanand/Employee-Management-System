package com.employee.system.repository;

import com.employee.system.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
