package Lork.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public GreetingService greeting() {
		return new ThaiGreeting();
	}
	
	@Bean
	public GreetingClience clience() {
		return new GreetingClience();
	}
}
