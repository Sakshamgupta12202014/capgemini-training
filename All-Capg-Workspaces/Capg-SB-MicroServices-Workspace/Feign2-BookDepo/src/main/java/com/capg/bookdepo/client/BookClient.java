package com.capg.bookdepo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.capg.bookdepo.entity.BookInfo;

@FeignClient(name="BookClient" , url="${book.service.url}")
public interface BookClient {
	
	@GetMapping("/bookInfo/getAllBooks")
	public List<BookInfo> getAllBooks();
}
