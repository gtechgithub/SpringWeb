package com.javapoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@SpringBootApplication
@ImportResource("spring-context.xml")
public class SpringBootMvcModelAttributesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcModelAttributesApplication.class, args);
	}
}
