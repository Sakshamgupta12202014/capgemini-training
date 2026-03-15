package com.capg.customerservice.dto;

import com.capg.customerservice.entity.Customer;

public interface CustomerDTOInt {
	public Customer createCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public Customer updateCustomer(int id , Customer customer);
	public void deleteCustomer(int id);
}
