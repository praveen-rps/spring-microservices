package com.example.onet2onedemo.dto;

import java.time.LocalDate;

import com.example.onet2onedemo.entities.Address;

public class CustomerDto {

	private Integer customerId;

	private String emailId;

	private String name;
//	private LocalDate dateOfBirth;
	
	private Address address;

	public CustomerDto() {

	}

	public CustomerDto(Integer customerId, String emailId, String name,Address address) {
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
