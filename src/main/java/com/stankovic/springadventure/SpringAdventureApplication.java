package com.stankovic.springadventure;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class SpringAdventureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdventureApplication.class, args);
		System.out.println("Server gestartet!");
	}


}
