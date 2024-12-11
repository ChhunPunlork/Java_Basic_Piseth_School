package com.JavaLearinging.ComponentAnn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	private MyComponent myComponent;
	
	public void greeting() {
		System.out.println(myComponent.getMassagr());
	}
}
