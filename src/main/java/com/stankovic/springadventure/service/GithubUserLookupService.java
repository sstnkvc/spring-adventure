package com.stankovic.springadventure.service;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stankovic.springadventure.model.User;
import com.stankovic.springadventure.tsysproxy.ProxyCustomizer;

@Service
public class GithubUserLookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(GithubUserLookupService.class);
	private static final String GITHUB_URL = "https://api.github.com/users/";
	
	private final RestTemplate template;

	public GithubUserLookupService(RestTemplateBuilder builder) {
		this.template = new RestTemplateBuilder(new ProxyCustomizer()).build();
	}
	
	public User findUser(String user) {
		logger.info("Looking up " + user);
		String url = GITHUB_URL.concat(user);
		User result = template.getForObject(url, User.class);
		return result;
	}
	
	@Async
	public CompletableFuture<User> findUserAsync(String user) throws InterruptedException {
		logger.info("Looking up " + user);
		String url = GITHUB_URL.concat(user);
		User result = template.getForObject(url, User.class);
		Thread.sleep(4000L);
		return CompletableFuture.completedFuture(result);
	}
	
	
	
	
	

}
