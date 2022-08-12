package com.inoptra.employeedepartmentdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inoptra.employeedepartmentdemo.models.Department;
import com.inoptra.employeedepartmentdemo.repositories.DepartmentRepository;

import lombok.extern.log4j.Log4j2;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Service layer contract which supports operations on Department object
 **/

@Log4j2
@Service
public class  DepartmentService {
	
	@Autowired
	DepartmentRepository deptDAO;
	
	
	
	public List<Department> loadDeptDetails() {
		List<Department> dList = deptDAO.findAllDepartments();
		return dList;
	}
}
