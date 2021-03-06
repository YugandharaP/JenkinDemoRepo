package com.bridgelabz.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemoApplication.class, args);

	}
	@GetMapping("/")
	public String getMessage() {
		return "Hello W First Project .....";
	}
	
}
