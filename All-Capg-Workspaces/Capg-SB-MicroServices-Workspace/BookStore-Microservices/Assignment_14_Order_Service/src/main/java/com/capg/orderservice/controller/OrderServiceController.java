package com.capg.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.orderservice.client.BookClient;
import com.capg.orderservice.model.Book;
import com.capg.orderservice.model.Order;
import com.capg.orderservice.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderServiceController {
	
	@Autowired
	OrderService service;
	
	
	@GetMapping
	public ResponseEntity<List<Order>> getAllOrders() {
		List<Order> orders = service.fetchAllOrders();
		ResponseEntity<List<Order>> responseEntity = new ResponseEntity<>(orders, new HttpHeaders(), HttpStatus.OK);
		
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> getOrderById(@PathVariable("id") long id) {
		
		Order order = service.getOrderById(id);
		
		if(order == null) {
			return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(order, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order orderRequest) {
		Order order = service.addOrder(orderRequest);
		return new ResponseEntity<>(order, new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable long id) {
		Order updatedOrder = service.updateOrder(id);
		if(updatedOrder == null) {
			return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		
		ResponseEntity<Order> responseEntity = new ResponseEntity<>(updatedOrder, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> cancelOrder(@PathVariable long id) {
		service.cancelOrder(id);
		
		return ResponseEntity.noContent().build();
	}

	
}
