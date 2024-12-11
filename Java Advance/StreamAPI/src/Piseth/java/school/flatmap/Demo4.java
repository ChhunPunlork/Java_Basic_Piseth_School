package Piseth.java.school.flatmap;

import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<Integer> number = List.of(12, 34, 22, 45, 56, 34, 98);
		Integer total = number.stream()
		.reduce(0, (a, b) -> a + b);
		System.out.println(total);
	}

}
