package com.example.onet2onedemo.dto;

public class AddressDto {
	
	private Long addressId;  //address_id
	private String street;
	private String city;
	public AddressDto() {
		
	}
	public AddressDto(Long addressId, String street, String city) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
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
