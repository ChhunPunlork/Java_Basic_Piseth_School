package com.piseth.java.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public GreetingService greetingService() {
		return new ThaiGreetingService();
	}
	
	@Bean
	public ClienceGreeting clience() {
		return new ClienceGreeting();
	}
}
