package com.veritas.soft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veritas.soft.dao.EmployeeRepository;
import com.veritas.soft.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	public Optional<Employee> getEmployeeById(Integer id) {
		return repo.findById(id);
		
	
		
	}

}
