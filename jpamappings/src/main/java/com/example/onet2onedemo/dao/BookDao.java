package com.example.onet2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onet2onedemo.entities.Book;

public interface BookDao extends JpaRepository<Book,Long>{

}
