package Piseth.java.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreanDemo {

	static List<String> names = List.of("Dara", "Thida", "Jeata", "Seyha", "Dani", "Davan", "Thida");
	public static void main(String[] args) {

//		CollectDemo();
//		List<Integer> collect = names.stream()
//			.map(String::length)
//			.distinct()
//			.collect(Collectors.toList());//concrete
//		System.out.println(collect);
//		names.stream()
//			.map(n -> {
//				System.out.println(n);
//				return n;
//			})
//			.count();
		CollectDemo();
	}
	static void CollectDemo() {
		Set<String> collectName = names.stream().collect(Collectors.toSet());
		System.out.println(collectName);
	}
	
	static void disctint() {
		//source
	}
	static void ls() {
//		Stream<String> streamName = names.stream();
//		long numberOflenht = streamName
//				.filter(n -> n.contains("t"))
//				.map(name -> name.length())//intermediate operation, lazy
//				.forEach(System.out::println)//terminal operation
//				.count();
//			System.out.println(numberOflenht);
	}

}
