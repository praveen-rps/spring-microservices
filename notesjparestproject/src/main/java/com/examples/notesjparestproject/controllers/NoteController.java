package com.examples.notesjparestproject.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.examples.notesjparestproject.exceptions.NotesNotFoundException;
import com.examples.notesjparestproject.models.Notes;
import com.examples.notesjparestproject.service.NoteService;

@RestController
public class NoteController {
	
	@Autowired
	NoteService service;
	
	@GetMapping("/notes/{title}/{author}")
	public List<Notes> findTitleNAuthors(@PathVariable String title,
			@PathVariable String author){
		return service.findByTitleNAuthor(title, author);
	}
	
	@GetMapping("/pid/{pid}")
	public List<Notes> findPidsByIds(@PathVariable Integer pid){
		return service.getNotesGreatherThanPid(pid);
	}
	
	@GetMapping("/titlesearch/{title}")
	public List<Notes> findAllTitles(@PathVariable String title){
		return service.getNotesByTitle(title);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Notes> showAllNotes(){
		return service.getAllNotes();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Notes insertNotes(@RequestBody Notes note) {
		return service.insertNotes(note);
	}
	
	@GetMapping("/search/{pid}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Notes> searchForNote(@PathVariable Integer pid) {
		Optional<Notes> notes = service.searchNotes(pid);
		if(notes.isEmpty())	
		throw new NotesNotFoundException("Notes with given pid is not found");
		return notes;
		
	}

}
