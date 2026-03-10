package com.corejava.layers;



public class ProductService {
	double discount;
    // // 100   java            250
	public int addProduct(int productId, String productName , double productPrice) throws ClassNotFoundException {
		System.out.println("This is ProductService");
		System.out.println(productId + "  " + productName + "  " + productPrice);
		
		if(productPrice <= 300) {
			discount = 10;
		}
		else if(productPrice>=300 && productPrice<=600) {
			discount = 20;
		}
		else {
			discount = 30;
		}
		
		ProductBean productBean = new ProductBean();
		
		productBean.setProductID(productId);  //100
		productBean.setProductName(productName);    //java
		productBean.setProductPrice(productPrice);    //250
		productBean.setDiscount(discount);    //C
		
		
		ProductDAO productDao = new ProductDAO();
		int k= productDao.addProduct(productBean);
		
		return k;
	}

}
