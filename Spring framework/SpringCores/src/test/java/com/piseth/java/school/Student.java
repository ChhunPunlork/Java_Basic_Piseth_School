package com.piseth.java.school;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private Subject subject;
	
	@PostConstruct
	public void init() {
		System.out.println("Student created");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Student destroyed");
	}
	
	public void displau() {
		subject.setSub();
	}
}
