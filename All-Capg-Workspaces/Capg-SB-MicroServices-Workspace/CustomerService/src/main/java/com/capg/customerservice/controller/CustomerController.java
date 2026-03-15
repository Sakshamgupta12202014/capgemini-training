package com.capg.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.customerservice.entity.Customer;
import com.capg.customerservice.service.CustomerServiceIntImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerServiceIntImpl customerService;
	
	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/{custid}")
	public Customer getCustomerById(@PathVariable("custid") int id) {
		return customerService.getCustomerById(id);
	}
	
	@PutMapping("/{custid}")
	public Customer updateCustomer(@PathVariable("custid") int id , @RequestBody Customer customer) {
		return customerService.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/{custid}")
	public void deleteCustomer(@PathVariable("custid") int id) {
		customerService.deleteCustomer(id);
	}
}
