package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		System.out.println("=======-----Auction_Plan Customer Started-----=======");
		SpringApplication.run(CustomerApplication.class, args);
	}

}
