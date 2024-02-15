package com.example.onet2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.onet2onedemo.entities.Customer;

//@Repository

public interface CustomerDao extends JpaRepository<Customer,Long>{

}
