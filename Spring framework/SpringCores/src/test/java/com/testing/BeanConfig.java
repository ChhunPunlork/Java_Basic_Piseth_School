package com.testing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Engine engine() {
		return new Gas_engine();
	}
	
	@Bean()
	public Servive servive() {
		return new Servive(engine());
	}
	
}
