package com.piseth.java.school;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBean.class);
		context.registerShutdownHook();
		
		
		
		String []bean = context.getBeanDefinitionNames();
		Arrays.stream(bean)
		.filter(n -> !n.contains("spring"))
		.forEach(System.out::println);
	}
}
