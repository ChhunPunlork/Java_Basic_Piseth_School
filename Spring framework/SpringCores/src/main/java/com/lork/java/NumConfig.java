package com.lork.java;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NumConfig {
	
	@Bean
	public List<Integer> integers(){
		return List.of(1,2,3,4,5);
	}
}
