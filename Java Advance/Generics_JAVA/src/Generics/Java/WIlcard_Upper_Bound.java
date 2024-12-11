package Generics.Java;

import java.util.List;

public class WIlcard_Upper_Bound {
	public static void main(String[] arqs) {
		List<Integer> list = List.of(1, 2, 3, 4, 5);
		double total = sum(list);
		System.out.println(total);
		
	}
	public static double sum(List<? extends Number> numbers) {
		double total = 0;
		for(Number num : numbers) {
			total += num.doubleValue();
		}
		
		
		return total;
	}
}