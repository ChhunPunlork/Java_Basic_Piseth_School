package function_Interface_Demo;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> print = txt -> System.out.println(txt);
		//print.accept("Chhun Punlork");
		
		List<Integer> list = List.of(11, 20, 36, 43, 59);
		
		Consumer<List<Integer>> display = intList -> {
			System.out.println("=================");
			System.out.println(intList);
		};
		//display.accept(list);
		
		Consumer<Integer> display2 = num -> System.out.println(num);
		//list.forEach(display2);
		//list.forEach((n) -> System.out.print(n + ", "));
		//list.forEach(System.out::println);
		
//		for(int i = 0; i< list.size(); i++) {
//			System.out.print(list.get(i));
//			if(list.get(i) % 2 == 0) {
//				System.out.println(": even");
//			}else {
//				System.out.println(": odd");
//			}
//		}
		Consumer<Integer> display3 = num -> {
			System.out.print(num);
			if(num % 2 == 0) {
				System.out.println(": even");
			}else {
				System.out.println(": odd");
			}
		};
		list.forEach(display3);
		
	}
}
