package com.bd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@EnableScheduling
@SpringBootApplication
public class WebNotifierApplication {

	private static final Logger log = LoggerFactory.getLogger(WebNotifierApplication.class);

    @Scheduled(fixedDelay = 1000L)
	private void dummitScheduler(){
        log.info("This is a message {}", new Date());
    }

	public static void main(String[] args) {
		SpringApplication.run(WebNotifierApplication.class, args);
	}
}
