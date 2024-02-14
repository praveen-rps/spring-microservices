package com.examples.notesjparestproject.exceptions;

public class NotesNotFoundException extends RuntimeException{
	
	public NotesNotFoundException(String msg) {
		super(msg);
	}

}
