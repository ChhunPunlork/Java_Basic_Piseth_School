package Piseth.java.school.flatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] arqs) {
		List<Student> students = List.of(
				new Student("Dara", 21, List.of("Eng", "Math")),
				new Student("Thida", 23, List.of("Khmer", "Phy", "Chemistry")),
				new Student("Chetra", 25, List.of("Eng", "Math")),
				new Student("Cheata", 22, List.of("Bio", "Japan")),
				new Student("Seyha", 30, List.of("Eng", "Math"))
				);
		
		//find all subjects[]
		List<Integer> collect2 = students.stream()
			.map(st -> st.getAge())
			.collect(Collectors.toList());
//		System.out.println(collect2);
		//list 
		
//		List<String> collect = students.stream()
//			.flatMap(stu -> stu.getSubject().stream())
//			.distinct()
//			.collect(Collectors.toList());
//		System.out.println(collect);
		Map<String, Long> collect3 = students.stream()
		.collect(Collectors.groupingBy(st -> st.getName(), Collectors.counting()));
		System.out.println(collect3);
		
		
	}
}
