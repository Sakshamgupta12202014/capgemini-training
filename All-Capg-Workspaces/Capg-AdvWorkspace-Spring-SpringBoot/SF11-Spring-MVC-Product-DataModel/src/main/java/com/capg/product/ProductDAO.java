package com.capg.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {
	public Product validateProduct(int product_no, String product_name, float product_price) {
		    System.out.println("product no = " + product_no);
		    System.out.println("product name = " + product_name);
		    System.out.println("product price = " + product_price);
		    
	        Product dbProduct = null;

	        try {
	            // Load Oracle Driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // Create DB connection
	            Connection con = DriverManager.getConnection(
	                "jdbc:oracle:thin:@localhost:1521:XE",
	                "scott",
	                "tiger"
	            );
	                   
	            System.out.println("DB CONNECTED");
	            PreparedStatement ps = con.prepareStatement(
	           "SELECT product_no, product_name, product_price FROM PRODUCTS WHERE product_no=?");

	            ps.setInt(1, product_no);
//	            ps.setString(2, product_name);
//	            ps.setFloat(3, product_price);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	            	dbProduct = new Product();
	            	dbProduct.setProduct_no(rs.getInt("product_no"));
	            	dbProduct.setProduct_name(rs.getString("product_name"));
	            	dbProduct.setPrice(rs.getFloat("product_price"));
	            	
	                System.out.println("Product Added Successfully");
	            } else {
	                System.out.println("NO RECORD FOUND");
	            }

	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return dbProduct;
	    }
}
