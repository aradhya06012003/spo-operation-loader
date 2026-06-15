package com.spo.core_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  //Enables the execution of scheduled jobs.
public class CoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreAppApplication.class, args);
	}

}