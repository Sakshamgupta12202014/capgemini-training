package com.capg.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@Autowired
	ProductsService productsService;
	
	@RequestMapping("/products")
	public List getAllProducts() {
		return productsService.getAllProducts();
	}
}
