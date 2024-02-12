package com.example.personcrud.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persons {
	public String id;
	public String name;
	public String city;

	
	public Persons(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.id=string;
		this.name=string2;
		this.city=string3;
	}
	
}
