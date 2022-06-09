package com.stankovic.springadventure.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter(value = AccessLevel.PUBLIC) @Setter @NoArgsConstructor
@Builder
@Data
public class Product {
	
	public Product(String id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	public Product() {
	}
	
	
	private String id;
	private String name;
	private String category;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
