package com.java.BeanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {
	public SingletonBean() {
		System.out.println("SingletonBean is instantiated");
	}
}
