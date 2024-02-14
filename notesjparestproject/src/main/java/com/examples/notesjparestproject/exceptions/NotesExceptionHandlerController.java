package com.examples.notesjparestproject.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class NotesExceptionHandlerController {
	
	 @ExceptionHandler(NotesNotFoundException.class)
	    public ResponseEntity<String> handleNotesNotFoundException(NotesNotFoundException ex) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	    }

}
