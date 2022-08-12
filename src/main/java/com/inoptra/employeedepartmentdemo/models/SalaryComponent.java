package com.inoptra.employeedepartmentdemo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/* @Author: Shrikrishna Prabhumirashi
 * @Description:
 * SalaryComponent is dependent upon base salary and can be calculated as baseSalary multiplied by respective factor.
 *  i.e. SalaryComponent_amount = baseSalary * factor;
 *  Actual salary can be calculated as sum of all SalaryComponent amounts.
 * */

@Entity
@NoArgsConstructor
@Table(name = "salarycomponent")
@Data
public class SalaryComponent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4979658616206989697L;


	private Long id;
	
	
	private Long primID;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getPrimID() {
		return primID;
	}

	public void setPrimID(Long primID) {
		this.primID = primID;
	}
		//@Id
	
	//@Id
	  private Salary salary;
	 
		@Column(name = "EMPLOYEE_ID")
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	
		
	@Column(name="component_name")
	private String name;

	private double factor;
	

	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="EMPLOYEE_ID", insertable = false, updatable = false, nullable = false)
    //@JoinColumn(name = "EMPLOYEE_ID", insertable = false, updatable = false, nullable = false)
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
}
