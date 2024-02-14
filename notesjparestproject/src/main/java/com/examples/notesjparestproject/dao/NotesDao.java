package com.examples.notesjparestproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.notesjparestproject.models.Notes;


@Repository
public interface NotesDao extends JpaRepository<Notes,Integer>{

}
