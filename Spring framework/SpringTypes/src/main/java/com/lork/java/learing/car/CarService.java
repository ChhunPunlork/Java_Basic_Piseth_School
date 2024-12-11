package com.lork.java.learing.car;

import org.springframework.beans.factory.annotation.Autowired;

public class CarService {
	@Autowired
	private Engine engine;

//	public Engine(Engine engine) {
//		this.engine = engine;
//	}

	public String carStart() {
		return engine.start();
	}

//	public void carStop() {
//		System.out.println("Car stop");
//	}

}