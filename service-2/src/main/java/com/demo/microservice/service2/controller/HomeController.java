package com.demo.microservice.service2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home")
public class HomeController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${spring.application.name}")
	private String name;
	
	@GetMapping(value="")
	public ResponseEntity<String> home() {
		
		StringBuilder messageBuilder = new StringBuilder("Welcome to app:")
			.append(name).append(" Home at port: ").append(port);
		
		return new ResponseEntity<String>(messageBuilder.toString(), HttpStatus.OK);
		
	}
	
}
