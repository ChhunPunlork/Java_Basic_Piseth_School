package com.lork.java;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class GasEngine implements Engine{

	@Override
	public String carUsing() {
		return "A car which using gas engine";
	}
	
}
