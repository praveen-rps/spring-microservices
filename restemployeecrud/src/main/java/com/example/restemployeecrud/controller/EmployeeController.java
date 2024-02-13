package com.example.restemployeecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restemployeecrud.model.Employee;
import com.example.restemployeecrud.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/nulldemo")
	public NullPointerException exeptionDemo() {
		return new NullPointerException();
	}
	
	@GetMapping("/search/{empid}")
	@ResponseBody
	public Employee searchEmployee(@PathVariable String empid) throws Exception{
			Employee emp = service.searchEmployee(empid);
			if(emp==null)
				throw new IndexOutOfBoundsException();
			return emp;
			
	}
	
	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> showAllEmployees(){
		return service.getAllEmployees();
	}
	

}
