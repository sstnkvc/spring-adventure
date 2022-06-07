package com.stankovic.springadventure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAdventureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdventureApplication.class, args);
		System.out.println("Server gestartet!");
	}

}
