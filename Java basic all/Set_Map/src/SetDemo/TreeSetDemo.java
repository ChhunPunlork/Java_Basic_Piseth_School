package SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
//		numbers.add(10);
		numbers.add(20);
		numbers.add(10);
		numbers.add(30);
		
		 System.out.println("Tree set element sorted: ");
		 
		 for(int number : numbers) {
			 System.out.println(number);
		 }
	}

}
