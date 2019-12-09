package com.example.demo.employee;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) throws Exception {
		return employeeService.getEmployeeById(id);
	}
}