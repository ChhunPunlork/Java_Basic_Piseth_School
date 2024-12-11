package com.lork.java.learing.car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		CarService carService = context.getBean(CarService.class);
		System.out.println(carService.carStart());
	}
	
}
