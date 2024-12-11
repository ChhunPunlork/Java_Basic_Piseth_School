package Piseth.java.usage.Demo2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Piseth.java.usage.Model.Student;

public class FunctonalInterfaceDemo {
	public static void main(String[] arqs) {
		List<Student> list = List.of(
				new Student("Lork", "M", 22),
				new Student("Lib", "F", 20),
				new Student("Phara", "M", 19),
				new Student("Bopha", "F", 30),
				new Student("Leap", "F", 21)
		);
		//collect gender by group
//		Map<String, List<Student>> GroupByGender = list.stream()
//		.collect(Collectors.groupingBy(p -> p.getGender()));
//		System.out.println(GroupByGender);
		List<Student> maleName = list.stream()
		.filter(gender -> gender.getGender() == "M")
		.collect(Collectors.toList());
		System.out.println(maleName);
		
		List<Student> FemaleName = list.stream()
				.filter(gender -> gender.getGender() == "F")
				.collect(Collectors.toList());
				System.out.println(FemaleName);
		
		
//		//print only F gender
////		list.stream()
////		.filter(st -> st.getGender() == "F")
////		.forEach(st -> System.out.println(st.getName()));
//		 //print first 3 F gender
//		
//		Comparator<Student> sortByAge = new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o2.getAge() - o1.getAge();
//			}
//		};
//		list.stream()
//		.limit(3)
//		.sorted(sortByAge)
//		.filter(st -> st.getGender() == "M")
//		.forEach(st -> System.out.println(st.getName() + ", " + st.getAge()));
				
		
//		
	}
	
}
