package com.example.restemployeecrud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	@ResponseStatus(HttpStatus.CREATED)
	public String handleEmployeeError() {
		return "Employee id is not found";
	}
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(HttpStatus.CREATED)
	public String handleNullError() {
		return "Null pointer is raised";
	}
	
}
