package com.dataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataSource {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataSource.class, args);
		System.out.println("Server has been started successfyllt!!");
	}
}


/*
@SpringBootApplication
	@Configuration : Allow us to register the bean or import additional configuration class
	@EnableAutoConfiguration: Enable spring boot's auto-configuration features.
	@ComponentScan :::Enables component scanning of the package specified
			@ComponentScan("dav.school.service"):: default will be base package

*/