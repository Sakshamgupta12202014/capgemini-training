package com.capg.demataccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DematAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(DematAccountApplication.class, args);
		System.out.println("Demat Acount Server started at port 8091");
	}

}
