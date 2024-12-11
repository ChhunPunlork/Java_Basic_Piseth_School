package Generics.Java;

import java.util.ArrayList;
import java.util.List;

public class Wilcard_Lower_Bound {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(2);
		
		List<String> name = List.of("Lork", "Long");
		
		display(number);
		display(name);
		

	}
	
	public static void addInteger(List<? super Integer> numbers) {
		
	}
	public static void display(List<?> list) {
	
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
