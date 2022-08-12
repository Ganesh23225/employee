package com.inoptra.employeedepartmentdemo.dtos;

import java.util.List;

import lombok.Data;

/* @Author: Shrikrishna Prabhumirashi
 * @Description:
 * SalaryComponent is dependent upon base salary and can be calculated as baseSalary multiplied by respective factor.
 *  i.e. SalaryComponent_amount = baseSalary * factor;
 *  Actual salary can be calculated as sum of all SalaryComponent amounts.
 * */
@Data
public class SalaryDTO {
	private double baseSalary;
	private List<SalaryComponentDTO> salaryComonents;

	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public List<SalaryComponentDTO> getSalaryComonents() {
		return salaryComonents;
	}
	public void setSalaryComonents(List<SalaryComponentDTO> salaryComonents) {
		this.salaryComonents = salaryComonents;
	}
	
}
