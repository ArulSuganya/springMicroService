package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Employee;
import com.xadmin.SpringBootCrud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees/(emp_id)")
	public void updateEmployee(@PathVariable String emp_id, @RequestBody Employee employee) {
		employeeService.updateEmployee(emp_id,employee);
	}
	
	public void deleteEmployee(@PathVariable String emp_id, @RequestBody Employee employee) {
		employeeService.deleteEmployee(emp_id,employee);
	}

}
