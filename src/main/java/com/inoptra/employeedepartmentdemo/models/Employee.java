package com.inoptra.employeedepartmentdemo.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Shrikrishna Prabhumirashi
 * @Description:
 * Represents Employee entity
 **/
@Entity
@Table(name = "employee")
@NoArgsConstructor
@Data
public class Employee {


	private Long id;

	@NotNull
	private String name;

	private Salary salary;

	private Department department;

	@Id
	@Column(name="EMPLOYEE_ID")
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

	/*@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)*/
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPARTMENT_ID")
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
    
}
