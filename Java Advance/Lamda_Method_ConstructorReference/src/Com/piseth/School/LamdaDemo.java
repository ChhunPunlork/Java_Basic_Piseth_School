package Com.piseth.School;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LamdaDemo {
	public static void main(String[] arqs) {
		Calculator calculator = new MyCalculator();
		Calculator cal = (n1, n2) -> n1 * n2 *10;
		cal.calcu(2, 2);
		System.out.println(cal);
	}
	static class MyCalculator implements Calculator{

		@Override
		public int calcu(int a, int b) {
			
			return (a + b) * 2;
		}
		
		
	}
	void test() {
		Infomation info = () -> System.out.println("Company information");
//		info.ShowInfo();
//
//		MyPrinter printer = (s) -> System.out.println(s);
//		printer.print("I love you");
//
//		MyPrinter printer2 = (s) -> System.out.println(s);
//		printer.print("I love you");

//		Comparator<Integer> compare = (p1, p2) -> p1 - p2;
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(23);
//		list1.add(15);
//		list1.add(42);
//		System.out.println(list1);
//		
//		Collections.sort(list1, compare);
//		System.out.println(list1);

//		MyPrinter printer = new MyPrinter() {
//			
//			@Override
//			public void print(String txt) {
//				System.out.println(txt);
//			}
//		};
		// lamda
//		MyPrinter myPrinter = (String txt) -> System.out.println(txt);
//		myPrinter.print("Lork");

		// match lamda to interface
//		List<String> list2 = new ArrayList<>();
//		list2.add("Dara");
//		list2.add("Thida");
//		list2.add("Vanda");
//		System.out.println(list2);
		List<String> list2 = List.of("Dara", "Thida", "Vanda");
		
		Collections.sort(list2, (p1, p2) -> p2.compareTo(p1));
		System.out.println(list2);
		
//		Map<String, Long> priceMap = new HashMap<>();
//		var priceMap = new HashMap<>();
//		priceMap.put("Apple", 30L);
		
//		Calculator calculator = (a, b) -> {
//			a = a*2;
//			System.out.println(a + " * "+ b + " = ?");
//			return a*b;
//		};
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		System.out.println(calculator.calcu(a, b));
	}
}
