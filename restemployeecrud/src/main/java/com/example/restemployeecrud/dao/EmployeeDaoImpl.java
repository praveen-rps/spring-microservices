package com.example.restemployeecrud.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.restemployeecrud.model.Employee;
import com.example.restemployeecrud.utils.EmployeeUtils;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	List<Employee> employees = new ArrayList<>();
	
	public EmployeeDaoImpl() {
		employees = EmployeeUtils.populateEmployeeData();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employees.add(employee))
			return employee;
		else
			return null;
	}

	@Override
	public Employee searchEmployee(String empid) throws Exception{
		// TODO Auto-generated method stub
		List<Employee> emps= employees.stream().filter(emp->emp.getEmpid().equals(empid)).map(emp->emp).collect(Collectors.toList());
		return emps.get(0);
	}

}
