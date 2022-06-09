package com.stankovic.springadventure.exceptions;

public class ProductNotFoundException extends RuntimeException{ 

	private static final long serialVersionUID = 1L; // ?????
	
	public ProductNotFoundException(Long id) {
		super("The product with " + id + "cant be found");
	}
}
