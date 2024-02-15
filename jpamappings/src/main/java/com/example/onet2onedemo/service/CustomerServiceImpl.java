package com.example.onet2onedemo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onet2onedemo.dao.CustomerDao;
import com.example.onet2onedemo.dto.CustomerDto;
import com.example.onet2onedemo.entities.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerDao customerDao;

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		/*
		ModelMapper modelMapper = new ModelMapper();
		List<CustomerDto> customerDtoList= new ArrayList<>();
		customerDao.findAll()
				  .forEach(customer-> customerDtoList.add(modelMapper.map(customer,CustomerDto.class)));
		return  customerDtoList;
		*/
		return customerDao.findAll();
	
	}

	@Override
	public Customer insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
	//	ModelMapper modelMapper = new ModelMapper();
		//Customer customer = modelMapper.map(customerDto, Customer.class);
		//return modelMapper.map(customerDao.save(customer), CustomerDto.class);
		return customerDao.save(customer);
	}

}
