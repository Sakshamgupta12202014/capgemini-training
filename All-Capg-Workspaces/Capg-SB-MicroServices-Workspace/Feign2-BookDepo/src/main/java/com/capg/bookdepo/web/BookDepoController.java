package com.capg.bookdepo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.bookdepo.client.BookClient;
import com.capg.bookdepo.entity.BookInfo;

@RestController
@RequestMapping("/bookDepo")
public class BookDepoController {

	private BookClient bookClient;
	
	public BookDepoController(BookClient bookClient) {
		this.bookClient = bookClient;
	}
	
	@GetMapping("/{bookDepoId}")
	public BookResponse getAllBooks(@PathVariable("bookDepoId") int id) {
		List<BookInfo> books = bookClient.getAllBooks();
		return new BookResponse(id + "" , "Chandausi" , books);
	}
	
	
	private static class BookResponse {
		private String depoId;
		private String depoAddress;
		private List<BookInfo> books;
		
		public BookResponse() {
			
		}
		
		public BookResponse(String depoId, String depoAddress, List<BookInfo> books) {
			super();
			this.depoId = depoId;
			this.depoAddress = depoAddress;
			this.books = books;
		}
		public String getDepoId() {
			return depoId;
		}
		public String getDepoAddress() {
			return depoAddress;
		}
		public List<BookInfo> getBookInfo() {
			return books;
		}
	}

}
