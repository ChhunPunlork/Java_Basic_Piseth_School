package function_Interface_Demo;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] arqs) {
//		Supplier<String> name = () -> ("Lork");
//		String name1 = name.get();
//		
		List<Integer> list = List.of(11, 23, 37, 43, 51);
//		Optional<Integer> firstEven = list.stream()
//		.filter(n -> n % 2 == 0)
//		.findFirst();
//		Integer FindfirstEven = firstEven(list); 
//		if(FindfirstEven != null) {
//			System.out.println(FindfirstEven + 10);
//		}
		Optional<Integer> findNum = list.stream()
				.filter(n -> n % 2 == 0)
				.findFirst();
		if(findNum.isPresent()) {
			System.out.println(findNum.get() + 10);
		}
		
		System.out.println("Complete");
		
		Integer findNum2 = list.stream()
				.filter(n -> n % 2 == 0)
				.findFirst()
				.orElseGet(()-> 0);
		System.out.println(findNum2 + 10);
		
	}
	static Integer firstEven (List<Integer> list) {
		for(Integer n : list) {
			if(n % 2 == 0) {
				return n;
			}
		}
		
		return null;
	}
}