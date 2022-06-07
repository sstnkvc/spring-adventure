package com.stankovic.springadventure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(value="/")
	public String firstMethod() {
		return "Willkommen zum Spring-Adventure";
	}
}
