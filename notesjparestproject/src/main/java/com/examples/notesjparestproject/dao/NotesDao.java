package com.examples.notesjparestproject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examples.notesjparestproject.models.Notes;


@Repository
public interface NotesDao extends JpaRepository<Notes,Integer>{
	public List<Notes> findByTitle(String title);
	public List<Notes> findByPidGreaterThan(int pid);
	
	@Query("select n from Notes n where n.author=?1 and n.title=?2")
	public List<Notes> findByNameAndTitle(String author, String title);
}
