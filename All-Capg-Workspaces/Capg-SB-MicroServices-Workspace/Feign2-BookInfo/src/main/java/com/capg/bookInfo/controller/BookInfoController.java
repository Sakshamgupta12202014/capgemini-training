package com.capg.bookInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.bookInfo.entity.BookInfo;
import com.capg.bookInfo.service.BookInfoServiceImpl;

@RestController
@RequestMapping("/bookInfo")
public class BookInfoController {
	
	@Autowired
	BookInfoServiceImpl service;
	
	@GetMapping("/getAllBooks")
	public List<BookInfo> getAllBooks() {
		return service.getAllBooks();
	}
	
	@PostMapping("/addBook")
	public Boolean addBook(@RequestBody BookInfo book) {
		return service.addBook(book);
	}
}
