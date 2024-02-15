package com.example.onet2onedemo.service;

import java.util.List;

import com.example.onet2onedemo.dto.CustomerDto;
import com.example.onet2onedemo.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public Customer insertCustomer(Customer customer);

}
