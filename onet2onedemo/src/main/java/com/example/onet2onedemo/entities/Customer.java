package com.example.onet2onedemo.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="customer")

public class Customer {
	
	@Id
	private Integer customerId;
	
	private String emailId;
	
	private String name;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id", unique=true)
	private Address address;
	public Customer() {
		
	}
	public Customer(Integer customerId, String emailId, String name,Address address) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.name = name;
		this.address=address;
	
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
