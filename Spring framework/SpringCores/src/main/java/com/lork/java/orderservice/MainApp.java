package com.lork.java.orderservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		OrderClient client = context.getBean(OrderClient.class);
		client.displayOrder();
		
	}
}
