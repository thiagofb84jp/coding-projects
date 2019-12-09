package com.example.demo.employee;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeeById(Long id) throws Exception {
		Optional<Employee> employeeOpt = employeeRepository.findById(id);

		if (employeeOpt.isPresent()) {
			return employeeOpt.get();
		}
		
		throw new NotFoundException("Employee not found. Please, put another value.");
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}