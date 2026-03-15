package com.capg.customerservice.dto;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.customerservice.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Repository
@Transactional
public class CustomerDTOIntImpl implements CustomerDTOInt{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return em.merge(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		Customer customer = em.find(Customer.class, id);
		return customer;
	}

	@Override
	public Customer updateCustomer(int id, Customer customer) {
		// TODO Auto-generated method stub
		Customer customerToUpdate = em.find(Customer.class, id);
		customerToUpdate.setName(customer.getName());
		customerToUpdate.setPhone(customer.getPhone());
		
		em.merge(customerToUpdate);
		return customerToUpdate;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Customer cust = em.find(Customer.class, id);
		em.remove(cust);
	}

}
