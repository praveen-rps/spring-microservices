package com.example.onet2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onet2onedemo.entities.Services;

public interface ServiceDao extends JpaRepository<Services,Long>{

}
