package com.stankovic.springadventure;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringAdventureApplicationAsynchronous {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdventureApplicationAsynchronous.class, args);
		System.out.println("Server gestartet!");
	}

//	@Bean //but why a bean ? --> not needed, as enableAsync uses a simple task executor by default
//	public Executor taskExecutor() {
//		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//		executor.setCorePoolSize(2);
//		executor.setMaxPoolSize(2);
//		executor.setQueueCapacity(500);
//		executor.setThreadNamePrefix("Github-Lookup");
//		return executor;
//	}

}
