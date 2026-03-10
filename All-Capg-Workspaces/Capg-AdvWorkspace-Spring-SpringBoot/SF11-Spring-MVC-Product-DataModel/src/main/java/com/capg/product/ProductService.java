package com.capg.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	/*
    @Autowired
    - Injects DAO layer
   */
   @Autowired
   private ProductDAO productDAO;

   // Business method
   public Product checkProduct(int product_no , String product_name, float product_price) {
       return productDAO.validateProduct(product_no, product_name, product_price);
   }
}
