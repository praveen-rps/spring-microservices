package com.example.restemployeecrud.dao;

import java.util.List;

import com.example.restemployeecrud.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public Employee searchEmployee(String empid) throws Exception;

}
