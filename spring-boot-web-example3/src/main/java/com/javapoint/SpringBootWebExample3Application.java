package com.javapoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.javapoint")
public class SpringBootWebExample3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebExample3Application.class, args);
	}
}
