package com.example.restemployeecrud.utils;

import java.util.ArrayList;
import java.util.List;

import com.example.restemployeecrud.model.Employee;

public class EmployeeUtils {
	
	static List<Employee> employees;

	

	public static List<Employee> populateEmployeeData() {
		employees = new ArrayList<>();
		Employee emp1 = new Employee("1001","anil","hr");
		Employee emp2 = new Employee("1002","suil","hr");
		Employee emp3 = new Employee("1003","kishore","finance");
		Employee emp4 = new Employee("1004","john","it");
		Employee emp5 = new Employee("1005","mary","quality");
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		return employees;
	}
}
