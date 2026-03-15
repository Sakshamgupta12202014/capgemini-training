package com.capg.customerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.customerservice.dto.CustomerDTOIntImpl;
import com.capg.customerservice.entity.Customer;

@Service
public class CustomerServiceIntImpl implements CustomerServiceInt {
	
	@Autowired
	CustomerDTOIntImpl customerDTO;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDTO.createCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDTO.getCustomerById(id);
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		return customerDTO.updateCustomer(id, customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDTO.deleteCustomer(id);
	}

}
