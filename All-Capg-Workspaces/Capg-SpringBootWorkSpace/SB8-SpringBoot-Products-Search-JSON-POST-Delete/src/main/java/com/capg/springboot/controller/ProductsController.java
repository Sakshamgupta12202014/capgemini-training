package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@RequestMapping(method=RequestMethod.GET, value="/products")
	public List getAllProducts() {
		return productsService.getAllProducts();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/products/{id}")
	public Product getProductByID(@PathVariable int id) {
		return productsService.getProductByID(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/products")
	public void addProduct(@RequestBody Product product) {
		productsService.addProduct(product);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
	public void removeProduct(@PathVariable int id) {
		productsService.deleteProduct(id);
	}
}
