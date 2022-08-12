package com.inoptra.employeedepartmentdemo.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

/* @Author: Shrikrishna Prabhumirashi
 * @Description:
 * SalaryComponent is dependent upon base salary and can be calculated as baseSalary multiplied by respective factor.
 *  i.e. SalaryComponent_amount = baseSalary * factor;
 *  Actual salary can be calculated as sum of all SalaryComponent amounts.
 * */

@Entity
@NoArgsConstructor
@Table(name = "salary")
public class Salary {
	private double baseSalary;
	
	/*@Column*/
	//@ElementCollection(targetClass=SalaryComponent.class)
	@Column
	@ElementCollection(targetClass=SalaryComponent.class)
	private List<SalaryComponent> salaryComonents = new ArrayList<>();
	
	@Id
    @Column(name = "EMPLOYEE_ID")
	private Long employeeId;
	
	@OneToOne(mappedBy = "salary",cascade = CascadeType.ALL)
    private Employee employee;

	public Long getEmployeeId() {
		return employeeId;
	}
	

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	/*public Long getEmployee() {
		return employee;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMPLOYEE_ID")
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	//@OneToMany(cascade = CascadeType.ALL)
	
	/*@OneToMany(targetEntity=SalaryComponent.class, mappedBy="salary", fetch=FetchType.EAGER)
	//@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "EMPLOYEE_ID")*/
	 
	//@OneToMany(mappedBy = "salary")
	//@OneToMany(mappedBy="salary", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	//@OneToMany(targetEntity=SalaryComponent.class, mappedBy="salary", fetch=FetchType.EAGER)
	  //@OneToMany(mappedBy = "salary")
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName="employeeId")
	public List<SalaryComponent> getSalaryComonents() {
		return salaryComonents;
	}
	public void setSalaryComonents(List<SalaryComponent> salaryComonents) {
		this.salaryComonents = salaryComonents;
	}
	
}
