package com.examples.notesjparestproject.models;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="notes")
public class Notes {
	
	@Id
	@Min(value=5000, message="pid must be above 5000")
	int pid;
	@NotNull(message="Author cannot be null")
	String author;
	String title;
	//@Range(min=10, max=250)
	String description;
	public Notes() {
		
	}
	public Notes(int pid, String author, String title, String description) {
		super();
		this.pid = pid;
		this.author = author;
		this.title = title;
		this.description = description;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
