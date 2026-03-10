package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Customer;
import com.capg.springboot.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public int addCustomer(Customer customer) {
		customerRepository.save(customer);
		return customer.getCustId();
	}
	
	public List<Customer> getAllCustomers(){
		List<Customer> custList = new ArrayList<>();
		
		customerRepository.findAll().forEach(c1 -> custList.add(c1));
		
		return custList;
	}
	
	public Customer getCustomerById(int custId) {
		return customerRepository.findById(custId).get();
	}
	
	public int updateCustomer(Customer customer) {
		customerRepository.save(customer);
		
		return customer.getCustId();
	}
	
	public int deleteCustomerById(int id) {
		 customerRepository.deleteById(id);
		 
		 return id;
	}
	

}
