package com.capg.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.orderservice.client.BookClient;
import com.capg.orderservice.model.Book;
import com.capg.orderservice.model.Order;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;


@Service
@Transactional
public class OrderService implements OrderServiceInt{
	
	@PersistenceContext
	private EntityManager em;
	
	private BookClient bookClient;
	
	public OrderService(BookClient bookClient) {
		this.bookClient = bookClient;
	}

	public List<Order> fetchAllOrders() {
		Query query = em.createQuery("Select o from Order o");
		List<Order> orders = query.getResultList();
		return orders;
	}

	@Override
	public Order getOrderById(long id) {
		return em.find(Order.class, id);
	}

	@Override
	public Order addOrder(Order orderRequest) {
		Book book = bookClient.getBookById(orderRequest.getBookId());
		if(book == null){
		    throw new RuntimeException("Book not found");
		}
		double totalPrice = orderRequest.getQuantity() * book.getPrice();
		orderRequest.setTotalPrice(totalPrice);
		
		Order saved = em.merge(orderRequest);
		return saved;
	}

	@Override
	public Order updateOrder(long id) {
		Order orderToupdate = em.find(Order.class, id);
		orderToupdate.setStatus("SHIPPED");
		
		return orderToupdate;
	}

	@Override
	public void cancelOrder(long id) {
		Order order = em.find(Order.class, id);
		em.remove(order);
	}

}
