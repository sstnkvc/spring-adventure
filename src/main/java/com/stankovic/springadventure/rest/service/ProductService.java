package com.stankovic.springadventure.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stankovic.springadventure.model.Product;
import com.stankovic.springadventure.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productsTable;
	
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		Iterable<Product>  iterable = this.productsTable.findAll();
		products = this.makeList(iterable);
		return products;
	}
	
	public Optional<Product> getProduct(Long id) {
		return this.productsTable.findById(id);
	}
	
	public void addProduct(Product product) {
		this.productsTable.save(product);
	}
	
	public void updateProduct(Product product) {
		Product p = this.getProduct(product.getId()).orElse(null);
		if(p != null) {
			this.productsTable.save(product);
		}
	}
	
	public void deleteProduct(Long id) {
		this.productsTable.deleteById(id);
		}
	
			

	
	public  <E> List<E> makeList(Iterable<E> iter) {
	    List<E> list = new ArrayList<E>();
	    for (E item : iter) {
	        list.add(item);
	    }
	    return list;
	}
	

}
