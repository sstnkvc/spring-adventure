package com.stankovic.springadventure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/organization/")
public class HomeController {
	
	@GetMapping(value="info") // url parameter muss hier name heißen
	public String myName(@RequestParam(defaultValue = "Sasa") String name) {
		return "<h2> Willkommen zum Spring-Adventure mit <i>" + name + "</i>! Das ist ein GET Request! </h2>";
	}
	
	@GetMapping(value="info2") // url parameter kann hier frei gewählt erden
	public String myName2(@RequestParam(name="programmerName",defaultValue = "Sasa") String name) {
		return "<h2> Willkommen zum Spring-Adventure mit <i>" + name + "</i>! Das ist ein GET Request! </h2>";
	}
	
	@GetMapping(value="info3/{pathVariableBinding}") // url parameter kann hier frei gewählt erden
	public String myName3(@PathVariable(name = "pathVariableBinding") String name) {
		return "<h2> Willkommen zum Spring-Adventure mit <i>" + name + "</i>! Das ist ein GET Request! </h2>";
	}
	
	
}
