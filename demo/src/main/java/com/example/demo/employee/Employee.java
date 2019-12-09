package com.example.demo.employee;

import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String lastName;

	private boolean active;
	
	private double salary;

	
	public Employee() {
		
	}
		
	public Employee(String name, String lastName, boolean active, double salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.active = active;
		this.salary = salary;
	}

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static double genSalary() {
		DecimalFormat decFormat = new DecimalFormat("#.##");

		double value = Math.random() * ((5000 - 1000) + 1) + 1000;
		
		String result = decFormat.format(value).replace(",", ".");
		
		return Double.valueOf(result);
	}
}