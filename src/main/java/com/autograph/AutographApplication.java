package com.autograph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutographApplication {

	public static void main(String[] args) {

		SpringApplication.run(AutographApplication.class, args);
		System.out.println("Autograph project is running");
	}

}
