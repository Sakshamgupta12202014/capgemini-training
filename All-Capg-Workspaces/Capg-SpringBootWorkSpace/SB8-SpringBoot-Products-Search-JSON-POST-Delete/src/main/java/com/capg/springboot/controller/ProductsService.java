package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	
	public List<Product> myProductsList = new ArrayList(Arrays.asList(new Product("Apple" , 123, 456.6), new Product("Kiwi" , 124, 756.6), new Product("Orange" , 125, 356.6)));
	
	public List<Product> getAllProducts() {
		return myProductsList;
	}
	
	public Product getProductByID(int id) {
		return (Product) myProductsList.stream().filter(p -> ((Product)p).getId() == id).findFirst().get();
	}
	
	public void addProduct(Product product) {
		myProductsList.add(product);
	}
	
	public void deleteProduct(int id) {
		myProductsList.removeIf(p -> ((Product)p).getId() == id);
	}
}
