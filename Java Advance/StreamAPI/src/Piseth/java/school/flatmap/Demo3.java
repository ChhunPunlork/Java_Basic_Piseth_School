package Piseth.java.school.flatmap;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = List.of("Dara", "Thida", "Jeata", "Seyhanu", "Dani", "Davan", "Thida");

		//nameWith_a
		boolean nameWith_a= names.stream()
				.anyMatch(name -> name.endsWith("a"));
//		System.out.println(anyMatch);
		
		//matchWith_a
		boolean matchWith_a = names.stream()
			.allMatch(n -> n.contains("a"));
//		System.out.println(matchWith_a);
		
//		Stream<String> nameString = names.stream();
//			long counter = nameString.count();
//			System.out.println(counter);
		
		
//			nameString.filter(n -> n.length() > 2);
//		Optional<String> first = names.stream()
//			.parallel()
//			.unordered()
//			.filter(n -> n.length() > 4)
//			.findFirst();
//			.findAny();
//		System.out.println("Option[" + first.get() + "]");
//			.orElse("No name");
//		if(first.isPresent()) {
//			System.out.println(first.get());
//		}
		
		//max min
//		Optional<String> longest = names.stream()
//			.max((x, y) -> x.length() - y.length());
//			
//		System.out.println(longest);
		
		Optional<String> cocatNumber = names.stream()
			.reduce((a, b) -> a + " - " + b);
		System.out.println(cocatNumber.get());
		
		
		
		
		
	}

}
