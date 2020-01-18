package com.satishkumar.dockerhub.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringBootDockerApplication {

	
	@GetMapping("/message")
	public ResponseEntity<String> greeting(){
		
		return  ResponseEntity.ok("Spring boot Docker Welcomes you ..!!!");
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
