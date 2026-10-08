package com.in28minuts.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minuts.microservices.limitsservice.bean.Limits;
import com.in28minuts.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsController {
	
	Configuration configuration;
	
	// 1. This is constructor injection. 
	// 2. spring 4.3 onwards @Autowire is Optional when class have only one constructor.
	@Autowired 
	public LimitsController(Configuration configuration) {
		this.configuration = configuration;
	}
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		//return new Limits(1,100);
	}
}
