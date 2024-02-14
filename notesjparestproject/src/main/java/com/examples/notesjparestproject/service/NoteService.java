package com.examples.notesjparestproject.service;

import java.util.List;
import java.util.Optional;

import com.examples.notesjparestproject.models.Notes;

public interface NoteService {
	
	public List<Notes> getAllNotes();
	public Notes insertNotes(Notes note);
	public Optional<Notes> searchNotes(int id);
	public List<Notes> getNotesByTitle(String title);
	public List<Notes> getNotesGreatherThanPid(int id);
	public List<Notes> findByTitleNAuthor(String title, String author);

}
