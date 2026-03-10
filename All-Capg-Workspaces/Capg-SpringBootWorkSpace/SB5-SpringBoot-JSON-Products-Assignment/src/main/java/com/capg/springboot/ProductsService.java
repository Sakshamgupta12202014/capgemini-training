package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductsService {
	
	public List productsList = Arrays.asList(new ProductsBean(122, "Apple", 220),
			new ProductsBean(123, "Papaya", 220), new ProductsBean(124, "Banana", 220));
	
	public List getAllProducts() {
		return productsList;
	}
}
