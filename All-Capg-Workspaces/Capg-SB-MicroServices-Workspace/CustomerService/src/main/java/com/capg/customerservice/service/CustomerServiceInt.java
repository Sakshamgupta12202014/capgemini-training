package com.capg.customerservice.service;

import com.capg.customerservice.entity.Customer;

public interface CustomerServiceInt {
	public Customer createCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public Customer updateCustomer(int id , Customer customer);
	public void deleteCustomer(int id);
}
