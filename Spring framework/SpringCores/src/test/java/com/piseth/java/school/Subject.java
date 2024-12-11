package com.piseth.java.school;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Subject {
	private String title;
	
	@PostConstruct
	public void init() {
		System.out.println("Subject created");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Subject destroyed");
	}
	
	public void setSub() {
		System.out.println("Set sub is being called");
	}
}
