package Lork.java;

import java.util.List;

public class UpperBoundWidcard {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 10);
		double total = sum(numbers);
		System.out.println(total);
		
		
	}

	public  static double sum(List<? extends Number> numbers) {
		double total = 0;
		for (Number num : numbers) {
			total += num.doubleValue();
		}
		return total;
	}
}
