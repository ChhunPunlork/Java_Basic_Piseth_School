package Lork.java;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWidcard {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		
		addInteger(list);
	}
	
	
	
	
	
	public static void addInteger(List<? super Integer> numbers ) {
		numbers.add(4);
	}
}
