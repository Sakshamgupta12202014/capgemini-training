package com.corejava.layers;


public class ProductController {

	public static void main(String[] args){
		
		try {
			int productID = 102;
			String productName = "Apple";
			double productPrice = 765.67;
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter BookID");
		
		ProductService productService = new ProductService();
		int t = -1;
		try {
			t = productService.addProduct(productID ,productName ,productPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("ProductController return value for db  :"+ t );
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
