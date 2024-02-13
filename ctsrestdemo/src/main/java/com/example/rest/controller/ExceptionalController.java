package com.example.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionalController {
	
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleExcpetion() {
		return "Error Occured";
	}

}
