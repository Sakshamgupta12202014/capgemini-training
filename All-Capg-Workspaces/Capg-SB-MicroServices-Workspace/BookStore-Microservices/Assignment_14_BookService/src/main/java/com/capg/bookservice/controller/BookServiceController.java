package com.capg.bookservice.controller;

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

import com.capg.bookservice.model.Book;
import com.capg.bookservice.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookServiceController {
	
	@Autowired
	BookService service;
	
	@GetMapping
	public ResponseEntity<List<Book>> getAllBooks() {
		List<Book> books = service.fetchAllBooks();
		ResponseEntity<List<Book>> responseEntity = new ResponseEntity<>(books, new HttpHeaders(), HttpStatus.OK);
		
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") long id) {
		
		Book book = service.getBookById(id);
		
		if(book == null) {
			return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(book, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	@PostMapping
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		
		Book savedBook = service.addBook(book);
		return new ResponseEntity<>(savedBook, new HttpHeaders(), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable long id , @RequestBody Book book) {
		Book updatedBook = service.updateBook(id, book);
		if(updatedBook == null) {
			return new ResponseEntity<>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
		}
		
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(updatedBook, new HttpHeaders(), HttpStatus.OK);
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteBook(@PathVariable long id) {
		service.deleteBook(id);
		
		return ResponseEntity.noContent().build();
	}

}
