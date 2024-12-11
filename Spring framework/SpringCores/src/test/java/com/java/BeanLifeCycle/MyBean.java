package com.java.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
	@PostConstruct
	public void init() {
		System.out.println("Bean is being initialized!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is being destroyed!");
	}
}
