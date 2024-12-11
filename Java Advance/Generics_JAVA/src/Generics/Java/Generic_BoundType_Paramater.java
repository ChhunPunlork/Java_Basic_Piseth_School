package Generics.Java;

import java.util.List;

public class Generic_BoundType_Paramater {
	
	public static <T extends Number> double Sum(List<T> numbers) {
		double total = 0;
		for(T num : numbers) {
			total += num.doubleValue();
		}
		return total;
	}
	

	public static void main(String[] args) {
		List<Integer> number = List.of(1, 2, 3, 4, 5);
		double result = Sum(number);
		System.out.println(result);
		
		List<Long> longs = List.of(1l, 2l, 3l);
		long num = (long) Sum(longs);
		System.out.println(num);
	}

}
