package com.capg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg")
public class RegisterbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterbackApplication.class, args);
	}
}
