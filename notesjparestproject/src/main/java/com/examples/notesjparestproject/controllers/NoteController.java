package com.examples.notesjparestproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examples.notesjparestproject.models.Notes;
import com.examples.notesjparestproject.service.NoteService;

@RestController
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@GetMapping
	public List<Notes> showAllNotes(){
		return service.getAllNotes();
		
	}
	
	@PostMapping
	public Notes insertNotes(@RequestBody Notes note) {
		return service.insertNotes(note);
	}
	
	@GetMapping("/search/{pid}")
	public Optional<Notes> searchForNote(@PathVariable Integer pid) {
		return service.searchNotes(pid);
	}

}
