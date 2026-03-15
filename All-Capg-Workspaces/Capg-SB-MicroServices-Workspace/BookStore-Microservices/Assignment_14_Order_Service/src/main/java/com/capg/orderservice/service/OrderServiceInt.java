package com.capg.orderservice.service;

import java.util.List;

import com.capg.orderservice.model.Order;

public interface OrderServiceInt {
	List<Order> fetchAllOrders();
	Order getOrderById(long id);
	Order addOrder(Order order);
	Order updateOrder(long id);
	void cancelOrder(long id);
}
