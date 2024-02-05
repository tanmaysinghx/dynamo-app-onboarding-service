package com.dynamoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamoAppOnboardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamoAppOnboardingServiceApplication.class, args);
		
		System.out.println("dynamo-app-onboarding-service is running");
	}

}
