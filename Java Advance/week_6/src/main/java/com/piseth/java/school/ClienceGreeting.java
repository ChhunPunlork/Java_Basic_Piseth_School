package com.piseth.java.school;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienceGreeting {
	
	@Autowired
	private GreetingService greetingService;
	
	public void Greet() {
		greetingService.SayHello();
	}

}
