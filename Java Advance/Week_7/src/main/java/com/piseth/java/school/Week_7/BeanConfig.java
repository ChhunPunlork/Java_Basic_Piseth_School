package com.piseth.java.school.Week_7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean(name = "myCalculator")
	Calculator getCalculator() {
		return new Calculator();
	}
}
