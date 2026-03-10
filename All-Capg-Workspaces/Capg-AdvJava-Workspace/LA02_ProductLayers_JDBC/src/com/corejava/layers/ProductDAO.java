package com.corejava.layers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {

	int i;            // 100  myjava 100  C
	public int addProduct(ProductBean productBean) throws ClassNotFoundException {
		
		System.out.println("Product DAO Layer");
		System.out.println("Product ID :" + productBean.getProductID());
		System.out.println("Product Name :" + productBean.getProductName());
		System.out.println("Product Price :" + productBean.getProductPrice());
		try {
			Connection conn = null;
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String driver = "oracle.jdbc.driver.OracleDriver";
			String userName = "scott"; 
			String password = "tiger";	 
			  Class.forName(driver);
				conn = DriverManager.getConnection(url,userName,password);
		        String query="insert into Product values(?,?,?,?)";
		        
		       PreparedStatement pstmt=conn.prepareStatement(query);
		        pstmt.setInt(1, productBean.getProductID()); //100
		        pstmt.setString(2,productBean.getProductName()); //java
		        pstmt.setDouble(3,productBean.getProductPrice()); //250
		        pstmt.setDouble(4, productBean.getDiscount()); //c
		        
		        i = pstmt.executeUpdate();
	        
	      }
	      catch(SQLException e) {
	    	  System.out.println(e);
	      }
		return i;
	}	
}