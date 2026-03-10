package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController

public class RatingController {
	
	@GetMapping("rating/book")
	public Book getAllBooksRatings() {
		return new Book(102, 4);
	}
}
