package com.inoptra.employeedepartmentdemo.dtos;

import lombok.Data;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Represents Employee entity
 **/
@Data
public class EmployeeDTO {

	private Long id;

	private String name;

	private SalaryDTO salary;

	private DepartmentDTO department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SalaryDTO getSalary() {
		return salary;
	}

	public void setSalary(SalaryDTO salary) {
		this.salary = salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentDTO department) {
		this.department = department;
	}
    
}
