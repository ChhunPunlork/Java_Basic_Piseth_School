package com.testing;

public class Servive {
	
	private Engine engine;
	
	public Servive (Engine engine){
		this.engine = engine;
	}
	
	public String carStart() {
		return engine.start();
	}
	
}
