package ForTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class test {

	public static void main(String[] args) {
		List<Students> student = List.of(
				new Students("Lork", "M", 23),
				new Students("Leu", "M", 24),
				new Students("Mara", "M", 23),
				new Students("Nith", "M", 25),
				new Students("Rath", "F", 28),
				new Students("La", "M", 16),
				new Students("Rong", "M", 15),
				new Students("Minh", "M", 10),
				new Students("Sing", "M", 5),
				new Students("Mav", "F", 41)
				);
//		Map<Integer, List<Students>> Age = student.stream()
//		.filter(print -> print.getAge() < 25)
//		.limit(3)
//		.forEach(name -> System.out.println(name.getName() + ", : " + name.getAge()));
//		.collect(Collectors.groupingBy(p -> p.getAge()));
//		System.out.println(Age.toString());
		
//		Map<Integer, Long> CountAge = student.stream()
//				.collect(Collectors.groupingBy(p -> p.getAge(), Collectors.counting()));
//				System.out.println(CountAge);
		
		//find student who can vote and cannot vote
//		Map<Boolean, List<Students>> map = student.stream()
//				.collect(Collectors.partitioningBy(st -> st.getAge() > 17));
//				System.out.println(map);
		//collection group by gender
//		Map<String,List<Students>> collect = student.stream()
//		.filter(p -> p.getAge() > 18)
//		.collect(Collectors.groupingBy(p -> p.getGender()));
//		System.out.println(collect);
		//collection group by age
//		Map<Integer, List<Students>> collect = student.stream()
//		.collect(Collectors.groupingBy(p -> p.getAge()));
//		System.out.println(collect);
		
		//voting age
		Map<Boolean, List<Students>> collect = student.stream()
		.collect(Collectors.partitioningBy(p -> p.getAge() >= 18));
		System.out.println(collect);
	}

}
