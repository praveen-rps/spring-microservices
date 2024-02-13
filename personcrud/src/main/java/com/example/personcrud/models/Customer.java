package com.example.personcrud.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
	
	//Pattern(pattern="regularexpression")
	//
	
	
	
	@Min(value=18, message="Age should be greater than 17")
	@Max(value=100, message="Age should be less than 100")
	int age;

	@NotNull(message="first name is required")
	 @Size(min=1, message="is required")
    private String firstName;

    @NotNull(message="last name is required")
    @Size(min=1, message="is required")
    private String lastName = "";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
}
