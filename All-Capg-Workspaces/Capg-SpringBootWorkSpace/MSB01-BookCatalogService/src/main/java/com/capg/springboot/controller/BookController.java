package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@RequestMapping("/list")
	public Book getAllBooks() {
		return new Book(101, "The road not taken ");
	}
}
