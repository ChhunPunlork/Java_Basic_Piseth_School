package Lork.java;

import java.util.List;

public class UnboudWidcard {
	
	public static void main(String[] args) {
		List<String> Strings = List.of("Dara", "Thida");
		printData(Strings);
		
		List<Integer> Ints = List.of(1, 2, 3, 4);
		printDataObject(Ints);
		printDataObject(Strings);
		
	}
	
	
	public static void printData(List<?> list) {
		for(int i=0; i<=list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void printDataObject(List<Object> list) {
		for(int i=0; i<=list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
