package com.example.onet2onedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onet2onedemo.entities.Address;
import com.example.onet2onedemo.entities.Customer;
import com.example.onet2onedemo.service.CustomerService;

@SpringBootApplication
public class Onet2onedemoApplication implements CommandLineRunner{
	
	@Autowired
	CustomerService service;

	public static void main(String[] args) {
		SpringApplication.run(Onet2onedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setAddressid(3L);
		address.setStreet("MG Road");
		address.setCity("bangalore");
		
		Customer customer = new Customer();
		customer.setCustomerId(10002);
		customer.setName("Sunil");
		customer.setEmailId("sunil@gmail.com");
		customer.setAddress(address);
		service.insertCustomer(customer);
		System.out.println("Customer is inserted....");
		
	}

}
