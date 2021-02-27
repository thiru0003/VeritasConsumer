package com.veritas.soft.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veritas.soft.model.Employee;
import com.veritas.soft.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/get/{eno}")
	public Optional<Employee> getEmployeeById(@PathVariable("eno")Integer id) {
		
		
				Optional<Employee> employeeById = service.getEmployeeById(id);
	
				return employeeById;
		
	}

}
