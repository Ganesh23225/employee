package com.inoptra.employeedepartmentdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inoptra.employeedepartmentdemo.models.Employee;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Persistence layer which performs operations on Employee entity
 **/
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	@Query("select DISTINCT OBJECT(e) from Employee e ")
	List<Employee> getEmployeeList();
	
	
	@Query("select e from Employee e where e.id = ?1")
	Employee findEmployeeByID(Long employeeID);
}
