package com.example.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.model.Employee;

@RestController  // @Controller + @ResponseBody
public class RestDemoController {
	// get method by using url /get --->service agreement

	@GetMapping("/reqs")
	public String getParams(@RequestParam("city") String city, @RequestParam("state") String state) {
		return "Helo user  you are from " + city + " of " + state;
	}

	@GetMapping("/employee")
	public ResponseEntity<Employee> getEmployee() {
		Employee emp = new Employee(1001, "kumar", "Mech");
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public Exception getMethod(@PathVariable String name) {
		return new Exception("an exception occcured");
	}

	@PostMapping("/post")
	//@ResponseBody
	@ResponseStatus(HttpStatus.CREATED)
	public Employee postMethod(@RequestBody Employee emp) {
		emp.setDept("finance");
		return emp;
	}

	@PutMapping("/put")
	public String putMethod() {
		return "putt method is called";
	}

	@DeleteMapping("/delete")
	public String deleteMethod() {
		return "delete method is called";
	}

}
