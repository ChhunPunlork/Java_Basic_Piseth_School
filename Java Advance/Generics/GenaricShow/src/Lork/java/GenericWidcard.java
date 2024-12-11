package Lork.java;

import java.util.ArrayList;
import java.util.List;

public class GenericWidcard {
	public static void main(String[] args) {
	//Can **
	//parameter
	//field variable
	//local variabe
	//return type
	List<String> list = List.of("dara", "thida");
	
	List<?> list1 = new ArrayList<>();
	
	List<Integer> list2 = new ArrayList<>();
	list2.add(2);
	list1 = list2;
	//System.out.println(list1);
	
	
	//cannot
	//invoking a generic method
	//instantiating a generic class
	}
	public void display(List<?> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	public class Piseth<T>{
		
	}
}
