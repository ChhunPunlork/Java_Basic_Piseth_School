package Lork.java;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingClience {
	@Autowired
	private GreetingService greetingService;
	
	public void greet() {
		greetingService.SayHello();
	}
}
