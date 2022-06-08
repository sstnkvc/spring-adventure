package com.stankovic.springadventure;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleScheduler {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 3000) // rate = every 3 secs; delay 3 seconds after executionc--> in this case 8 sec
	public void printTime() throws InterruptedException {
		System.out.println("The time is now: " + format.format(new Date()));
		Thread.sleep(5000);
	}

}
