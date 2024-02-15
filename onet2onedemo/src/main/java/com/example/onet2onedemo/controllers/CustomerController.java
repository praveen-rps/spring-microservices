package com.example.onet2onedemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.onet2onedemo.dto.CustomerDto;
import com.example.onet2onedemo.entities.Customer;
import com.example.onet2onedemo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@PostMapping
	public Customer insertCustomer(@RequestBody Customer customer) {
		return service.insertCustomer(customer);
	}
	

}
