package com.inoptra.employeedepartmentdemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inoptra.employeedepartmentdemo.models.Department;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Persistence layer which performs operations on Department entity
 **/
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	@Query("select DISTINCT OBJECT(d) from Department d" /*LEFT OUTER JOIN FETCH d.employees*/)
	List<Department> findAllDepartments();
	
	@Query("select d from Department d LEFT OUTER JOIN FETCH d.employees where d.id = ?1")
	Department findDepartmentsByID(Long departmentID);

	/*@Query("select * from department")
	List<Department> findBasicDeptInfo();*/
}
