package com.testing;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class)) {
			Servive servive = context.getBean(Servive.class);
			System.out.println(servive.carStart());
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

}
