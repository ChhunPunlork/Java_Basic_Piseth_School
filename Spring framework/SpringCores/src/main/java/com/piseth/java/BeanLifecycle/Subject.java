package com.piseth.java.BeanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class Subject {
	private String title;

//	@PostConstruct
	public void init() {
		System.out.println("Subject created");
	}

//	@PreDestroy
	public void clear() {
		System.out.println("Subject destroyed");
	}

	public void setSubject() {
		System.out.println("Set subject method is called");
	}
}
