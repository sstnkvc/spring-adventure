package com.stankovic.springadventure.runner;

import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.stankovic.springadventure.model.User;
import com.stankovic.springadventure.service.GithubUserLookupService;

@Component
public class GithubUserLookupRunner implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(GithubUserLookupRunner.class);

	
	@Autowired
	private GithubUserLookupService service;

	@Override
	public void run(String... args) throws Exception {
		logger.info("--------- SYNCHRO---------");
		User info1 = service.findUser("sstnkvc");
		User info2 = service.findUser("NSTSA1");
		User info3 = service.findUser("Pytorch");
		
		
		logger.info("---> " + info1);
		logger.info("---> " + info2);
		logger.info("---> " + info3);
		
		
		logger.info("--------- ASYNCHRON---------");
		
		CompletableFuture<User> uno = service.findUserAsync("sstnkvc");
		CompletableFuture<User> dos = service.findUserAsync("NSTSA1");
		CompletableFuture<User> tres = service.findUserAsync("Pytorch");
		
		CompletableFuture.allOf(uno,dos,tres).join();

		logger.info("---> " + uno.get());
		logger.info("---> " + dos.get());
		logger.info("---> " + tres.get());



		// TODO Auto-generated method stub
		
	}

}
