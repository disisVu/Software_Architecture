package com.example.TaxiTransportService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SoftwareArchitectureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareArchitectureApplication.class, args);
	}

}
