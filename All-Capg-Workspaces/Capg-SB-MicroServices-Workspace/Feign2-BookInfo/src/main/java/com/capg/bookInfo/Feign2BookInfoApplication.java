package com.capg.bookInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.capg.bookInfo.entity")
public class Feign2BookInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Feign2BookInfoApplication.class, args);
		System.out.println("The Book info server is started");
	}

}
