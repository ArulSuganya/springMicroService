package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Employee;
import com.xadmin.SpringBootCrud.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployee(){
		List<Employee> employees = new ArrayList<>();
		employeeRepo.findAll().forEach(employees::add);
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee); // store in database
	}
	
	public void updateEmployee(String emp_id, Employee employee) {
		employeeRepo.save(employee); // store and update in database 
	}
	
	public void deleteEmployee(String emp_id, Employee employee) {
		employeeRepo.delete(employee);
	}

}
