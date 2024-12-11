package com.lork.java.orderservice;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderClient {
//	@Qualifier("orderServiceA")
//	@Autowired
	@Resource(name = "orderServiceA")
	OrderService orderService;
	
	public void displayOrder() {
		System.out.println(orderService.order());
	}
}
