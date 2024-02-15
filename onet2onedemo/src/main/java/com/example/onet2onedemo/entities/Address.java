package com.example.onet2onedemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	private Long addressid;  //address_id
	private String street;
	private String city;
	public Address() {
		
	}
	public Address(Long addressid, String street, String city) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
	}
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
