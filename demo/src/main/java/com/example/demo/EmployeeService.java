package com.example.demo;

import java.util.List;

public interface EmployeeService {
	
	Employee getEmployeeById(long id);
	
	List<Employee> getAllEmployees();

}