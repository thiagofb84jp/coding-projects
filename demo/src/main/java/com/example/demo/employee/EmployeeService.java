package com.example.demo.employee;

import java.util.List;

public interface EmployeeService {
	
	Employee getEmployeeById(Long id) throws Exception;
	
	List<Employee> getAllEmployees();

}