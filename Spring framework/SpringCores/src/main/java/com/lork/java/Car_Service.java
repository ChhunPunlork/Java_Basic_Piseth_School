package com.lork.java;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;

//@Setter

public class Car_Service {
//	@Autowired
	@Inject
	private Engine engine;
	
//	public Car_Service(Engine engine) {
//		this.engine = engine;
//	}s
	
	public String CarGo() {
		return engine.carUsing();
	}
}
