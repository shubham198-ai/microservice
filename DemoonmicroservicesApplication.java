package com.example.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoonmicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoonmicroservicesApplication.class, args);
	}

}
