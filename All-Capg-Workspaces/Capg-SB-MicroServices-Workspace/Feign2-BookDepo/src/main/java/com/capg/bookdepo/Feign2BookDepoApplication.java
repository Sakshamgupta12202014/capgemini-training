package com.capg.bookdepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.capg.bookdepo.client")
public class Feign2BookDepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Feign2BookDepoApplication.class, args);
		System.out.println("The Book Depo service is started");
	}

}
