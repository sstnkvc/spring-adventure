package com.stankovic.springadventure.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stankovic.springadventure.model.Product;

@Service
public class ProductService {
	
	List<Product> loadedProducts = new ArrayList( Arrays.asList(
			new Product("P101","Monitor","Electronics"),
			new Product("P102","Blanket","Household"),
			new Product("P103","Laptop","Electronics"),
			new Product("P104","Shirt","Fashion"),
			new Product("P105","Pens","Office")));
			
	
	
	public List<Product> getAllProducts(){
		return this.loadedProducts;
	}
	
	public Product getProduct(String id) {
		Product p = this.loadedProducts.stream().filter(product -> product.getId().equalsIgnoreCase(id)).findFirst().get();
		return p;
	}
	
	public void addProduct(Product p) {
		this.loadedProducts.add(p);
	}
	
	
	public void overwriteProductOnIndex(String id, Product p) {
		for (int i = 0; i < this.loadedProducts.size(); i++) {
			Product iteratedProduct = this.loadedProducts.get(i);
			if(iteratedProduct.getId().equals(id)) {
				this.loadedProducts.set(i, p);
				return;
			}
		}
	}
	
	public void deleteProduct(String id) {
		this.loadedProducts.removeIf(product -> product.getId().equals(id));
		
	}
	

}
