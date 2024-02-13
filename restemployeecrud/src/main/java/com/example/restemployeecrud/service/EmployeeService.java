package com.example.restemployeecrud.service;

import java.util.List;

import com.example.restemployeecrud.model.Employee;

public interface EmployeeService {
		public List<Employee> getAllEmployees();
		public Employee addEmployee(Employee employee);
		public Employee searchEmployee(String empid) throws Exception;
}
