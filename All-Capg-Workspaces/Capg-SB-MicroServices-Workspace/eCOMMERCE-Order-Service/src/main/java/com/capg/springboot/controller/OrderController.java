package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Product;

/**
 * Order Controller
 * Handles order placement
 */
@RestController
@RequestMapping("/order")
public class OrderController {
	
	private InventoryClient inventoryClient;
	private ProductClient productClient;

    public OrderController(InventoryClient inventoryClient, ProductClient productClient) {
		super();
		this.inventoryClient = inventoryClient;
		this.productClient = productClient;
	}

//	@PostMapping("/place/{productId}")
//    public String placeOrder(@PathVariable Long productId) {
//        return "Order service working for product " + productId;
//    }
	
	@GetMapping("/place/{id}")
	public OrderResponse showOrderDetails(@PathVariable("id") Long id) {
		
		Boolean isProductAvaialble = inventoryClient.isStockAvailable(id);
		
		if(isProductAvaialble) {
			Product product = productClient.getProduct(id);
			return new OrderResponse("Order Id - 101", product);
		}
		
		return null;
	}
   
	
	public static class OrderResponse {
		private String orderId;
		private Product product;
		
		public String getOrderId() {
			return orderId;
		}

		public Product getProduct() {
			return product;
		}

		public OrderResponse(String orderId, Product product) {
			super();
			this.orderId = orderId;
			this.product = product;
		}
		
		public OrderResponse() {
			
		}
	}
    
}