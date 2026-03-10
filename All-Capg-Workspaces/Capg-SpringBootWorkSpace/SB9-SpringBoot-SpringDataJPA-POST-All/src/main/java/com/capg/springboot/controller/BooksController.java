package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@Autowired 
	BooksService booksService;
	
	
	// Add books
	@PostMapping("/addbook")
	public int addBook(@RequestBody Books book) {
		booksService.addBook(book);
		return book.getBookid();
	}
	
	// Retrieve All books 
	@GetMapping("/getbooks")
	public List getAllBooks() {
		return booksService.getAllBooks();
	}
}
