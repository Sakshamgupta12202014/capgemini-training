package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Customer;
import com.capg.springboot.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/addcustomer")
	public int addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return customer.getCustId();
	}
	
	@GetMapping("/allcustomers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/updatecustomer")
	public int updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
		
	}
	
	@DeleteMapping("/deletecustomer/{id}")
	public int deleteCustomerById(@PathVariable int id) {
		 return customerService.deleteCustomerById(id);
		 
	}
	
	
}
