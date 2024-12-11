package com.lork.java.learing.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public Engine engine() {
		return new PetroEngine();
	}
	@Bean
	public CarService carService() {
		return new CarService();
	}

}
