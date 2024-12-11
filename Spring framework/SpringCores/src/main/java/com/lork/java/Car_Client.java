package com.lork.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car_Client {
	
	@Bean 
	public Engine engine() {
		return new GasEngine();
	}
	
	@Bean()
	public Car_Service car_Service() {
		return new Car_Service();
	}
}
