package com.examples.notesjparestproject.models;

import jakarta.validation.constraints.NotNull;

public class Book {
    @NotNull
    private Long id;
    
    @NotNull
    private String author;
    
    @NotNull
    private String title;
    
    @NotNull
    private String description;
    
    public Book() {
    	
    }
    public Book(@NotNull Long id, @NotNull String author, @NotNull String title, @NotNull String description) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.description = description;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

