package com.example.restemployeecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restemployeecrud.dao.EmployeeDao;
import com.example.restemployeecrud.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	@Override
	public Employee searchEmployee(String empid) throws Exception {
		// TODO Auto-generated method stub
		return dao.searchEmployee(empid);
	}

}
