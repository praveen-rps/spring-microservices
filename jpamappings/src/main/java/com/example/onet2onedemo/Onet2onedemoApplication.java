package com.example.onet2onedemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onet2onedemo.dao.AuthorDao;
import com.example.onet2onedemo.dao.CustomerDao;
import com.example.onet2onedemo.entities.Author;
import com.example.onet2onedemo.entities.Book;
import com.example.onet2onedemo.entities.Customer;
import com.example.onet2onedemo.entities.Services;

@SpringBootApplication
public class Onet2onedemoApplication implements CommandLineRunner {

	@Autowired
	AuthorDao dao;

	@Autowired
	CustomerDao custDao;

	public static void main(String[] args) {
		SpringApplication.run(Onet2onedemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// TODO Auto-generated method stub
		/*
		 * Address address = new Address(); address.setAddressid(3L);
		 * address.setStreet("MG Road"); address.setCity("bangalore");
		 * 
		 * Customer customer = new Customer(); customer.setCustomerId(10002);
		 * customer.setName("Sunil"); customer.setEmailId("sunil@gmail.com");
		 * customer.setAddress(address); service.insertCustomer(customer);
		 * System.out.println("Customer is inserted....");
		 
		Book book1 = new Book();
		book1.setId(10L);
		book1.setTitle("springbooot");

		Book book2 = new Book();
		book2.setId(18L);
		book2.setTitle("microservices");

		Author author = new Author();
		author.setId(10001L);
		author.setName("Bob");
		
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		author.setBooks(books);
		
	//	author.getBooks().add(book1);
	//	author.getBooks().add(book2);
*/
		//dao.save(author);
		addCustomerAndService();
		System.out.println("customers and services are added");

	}

	public void addCustomerAndService() {
		try {
			Customer customer = new Customer();
			customer.setDateOfBirth(LocalDate.of(1995, 2, 1));
			customer.setEmailId("peter@infy.com");
			customer.setName("Peter");

			Set<Services> servicesList = new LinkedHashSet<Services>();
			Services services1 = new Services();
			services1.setServiceId(3004);
			services1.setServiceName("Demat Services");
			services1.setServiceCost(200);
			
			Services services2 = new Services();
			services2.setServiceId(3005);
			services2.setServiceName("Insurance Services");
			services2.setServiceCost(2000);

			servicesList.add(services1);
			servicesList.add(services2);

			customer.setBankServices(servicesList);

			// Integer customerId=bankService.addCustomerAndService(customerDTO);
			custDao.save(customer);
			System.out.println("customers and services are added...");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
