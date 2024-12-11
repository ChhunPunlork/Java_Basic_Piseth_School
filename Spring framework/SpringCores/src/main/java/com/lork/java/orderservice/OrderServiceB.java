package com.lork.java.orderservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceB implements OrderService{

	@Override
	public String order() {
		return "Order from service B";
	}

}
