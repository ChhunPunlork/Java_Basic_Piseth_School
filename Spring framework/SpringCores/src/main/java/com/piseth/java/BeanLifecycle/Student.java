package com.piseth.java.BeanLifecycle;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class Student /* implements InitializingBean , DisposableBean */ {
//	@Autowired
//	@Lazy
//	private Subject subject;
	@Autowired
	private String []favouriteColor;
	
	public void displayColor() {
		System.out.println(Arrays.toString(favouriteColor));
	}

//	@PostConstruct
	public void setUp() {
		System.out.println("Student created");
	}

//	@PreDestroy
	public void clear() {
		System.out.println("Student destroyed");
	}
	
	public void display() {
		System.out.println("=========in display method======");
//		subject.setSubject();
//		System.out.println("Display from student");
	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("After student created");
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Student destroyed ");
//	}

}
