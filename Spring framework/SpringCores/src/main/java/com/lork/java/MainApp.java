package com.lork.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Car_Client.class, NumConfig.class);
			
		Car_Service car_Service = context.getBean(Car_Service.class);
		System.out.println(car_Service.CarGo());
		
		
	}

}
