package com.stankovic.springadventure.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stankovic.springadventure.exceptions.ProductNotFoundException;
import com.stankovic.springadventure.model.Product;
import com.stankovic.springadventure.rest.service.ProductService;

@RestController
public class ProductApiController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
	return productService.getAllProducts();
	}
	
	@GetMapping("/products/{pId}")
	public Product getProduct(@PathVariable(name = "pId") Long id) {
		return productService.getProduct(id).orElseThrow(() -> new ProductNotFoundException(id));
	}
	
	@PostMapping("products")
	public void addProduct(@RequestBody Product p) {
		this.productService.addProduct(p);
	}
	
	
	@PutMapping("products")
	public void overwriteProduct(@RequestBody Product p) {
		this.productService.updateProduct(p);
	}
	
	@DeleteMapping("products/{id}")
	public void deleteProduct(@PathVariable(name = "id") Long id) {
		this.productService.deleteProduct(id);
	}
	

}
