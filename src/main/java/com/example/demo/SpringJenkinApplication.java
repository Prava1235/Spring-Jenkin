package com.example.demo;


import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinApplication {
  public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplication.class);
  
  @PostConstruct
   public void intt() {
	  logger.info("Application Started ....");
  }
	public static void main(String[] args) {
		
		logger.info("Application Executed ....");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
