package Piseth.java.usage.Demo;

import java.util.List;
import java.util.stream.Collectors;

public class UsageWIthStream {

	public static void main(String[] args) {
		List<String> names = List.of("Dara", "Seyha", "Thida", "Dalin");
		//print all
//		names.stream()
//			.forEach(name -> System.out.print(name + ", "));
		
		//print uppercase
//		names.stream()
//			.map(st -> st.length())
//			.forEach(name -> System.out.println(name));
		
		//priny only with lengh > 4
//		names.stream()
//		.filter(name -> name.length()>4)
//		.forEach(name -> System.out.println(name));
		
		//print uppercase
//		names.stream()
//			.map(String::toUpperCase)
//			.forEach(System.out::println);
		
		//collect gender
//		names.stream()
//		.collect(Collectors.groupingBy())
			
	}

}
