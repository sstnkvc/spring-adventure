package com.stankovic.springadventure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home/")
public class ParentController {
	
	@GetMapping(value="hallo")
	public String sayHello() {
		return "Hallo Sasa!";
	}

}
