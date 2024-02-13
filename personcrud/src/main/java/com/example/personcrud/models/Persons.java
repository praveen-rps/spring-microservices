package com.example.personcrud.models;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Persons {
	
	@Size(min=3, message="size cannot cannot be less than 3 characters")
	public String id;
	@Size(min=3 ,message="name cannot be less than 3 characters")
	public String name;
	
	@Size(min=4 ,message="city cannot be less than 4 characters")
	public String city;

	public Persons() {
		
	}
	public Persons(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.id=string;
		this.name=string2;
		this.city=string3;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
