package com.capg.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.capg.orderservice.model.Book;

@FeignClient(name="BOOK-SERVICE")
public interface BookClient {
	
	@GetMapping("/api/books")
	public List<Book> fetchAllBooks();
	
	@GetMapping("/api/books/{id}")
	public Book getBookById(long id);
	
	@PostMapping("/api/books")
	public Book addBook(Book book);
	
	@PutMapping("/api/books/{id}")
	public Book updateBook(long id , Book book);
	
	@DeleteMapping("/api/books/{id}")
	public void deleteBook(long id);
}
