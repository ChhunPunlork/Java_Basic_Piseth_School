package Generics.Java;

import java.util.ArrayList;
import java.util.List;

import Generics.Java.Generic_Inheritance.Piseth;

public class Generic_Wilcard {

	public static void main(String[] args) {
		
		List<String> name = List.of("Dara", "Lork");
		display(name);
		List<?> list1 = new ArrayList<String>();
		//list1.add("Lork");
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		
		list1 = list2;
		
		System.out.println(list1);
		
		Piseth<String> ps = new Piseth<String>();
	}
	
	public List<?> getList(){
		return null;
	}
	
	public static void display(List<?> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
