package com.example.onet2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onet2onedemo.entities.Author;

public interface AuthorDao extends JpaRepository<Author,Long>{

}
