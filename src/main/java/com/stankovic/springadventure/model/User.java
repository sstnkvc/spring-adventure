package com.stankovic.springadventure.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @NoArgsConstructor
public class User {
	
	private String name;
	private String blog;
	private String type;
	private String url;
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", blog=" + blog + ", type=" + type + ", url=" + url + "]";
	}
	
	
}
