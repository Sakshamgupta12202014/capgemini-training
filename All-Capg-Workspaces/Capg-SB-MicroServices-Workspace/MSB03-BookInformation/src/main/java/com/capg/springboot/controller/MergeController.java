package com.capg.springboot.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.springboot.dto.Book;
import com.capg.springboot.dto.BookInfo;
import com.capg.springboot.dto.BookRating;

@RestController
@RequestMapping("/info")
public class MergeController {
	
	@Autowired
	RestTemplate rest;
	
	@RequestMapping("/list")
	public List<Book>getAllInfo() {
		BookRating bookRating = rest.getForObject("http://localhost:9096/rating/book" , BookRating.class);
		BookInfo bookInfo = rest.getForObject("http://localhost:9095/book/list", BookInfo.class);
		
		return Collections.singletonList(new Book(101 , bookInfo.getBookName(), bookRating.getRating()));
	}
}
