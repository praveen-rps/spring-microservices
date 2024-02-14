package com.examples.notesjparestproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.notesjparestproject.dao.NotesDao;
import com.examples.notesjparestproject.models.Notes;


@Service
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NotesDao dao;
	@Override
	public List<Notes> getAllNotes() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Notes insertNotes(Notes note) {
		// TODO Auto-generated method stub
		return dao.save(note);
	}

	@Override
	public Optional<Notes> searchNotes(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Notes> getNotesByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}

	@Override
	public List<Notes> getNotesGreatherThanPid(int id) {
		// TODO Auto-generated method stub
		return dao.findByPidGreaterThan(id);
	}

	@Override
	public List<Notes> findByTitleNAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return dao.findByNameAndTitle(author, title);
	}

}
