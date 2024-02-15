package com.example.onet2onedemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onet2onedemo.entities.Address;

public interface AddressDao extends JpaRepository<Address,Long>{

}
