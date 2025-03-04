package Lork.java;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class studentApplication {
	private static List<Students> students =  List.of(
			
			new Students(1, "Lork", "M", 22),
			new Students(2, "Dina", "M", 29),
			new Students(3, "Sreyka", "FM", 26),
			new Students(4, "Leu", "M", 23),
			new Students(5, "Sreykhouch", "FM", 31),
			new Students(6, "Nith", "M", 24),
			new Students(7, "Nha", "M", 33),
			new Students(8, "Meng", "M", 12),
			new Students(9, "Rath", "FM", 29)
			
		);
		
	
	
	
	public static void main(String[] args) {
		List<Students> list1 = getStudentsImperative(students);
		for(Students st : list1) {
			System.out.println(st);
		}
		List<Students> list2 = getStudentsDeclarative(students);
		list1.forEach(System.out::println);
		
	}
	
	public static List<Students> getStudentsImperative(List<Students> students){
		System.out.println("\t=====Imperative Style!=====");
		List<Students> list = new ArrayList<>();
		int counter = 0;
		int limit = 3;
		for(Students st: students) {
			if(st.getGender().equals("FM")) {
				list.add(st);
				counter++;
			}
			if(counter == limit) {
				break;
			}
		}
		return list;
	}
	public static List<Students> getStudentsDeclarative(List<Students> students){
		System.out.println("\t=====Declarative Style!=====");
		return students.stream()
		.filter(st -> st.getGender().equals("FM"))
		.limit(3)
		.collect(Collectors.toList());
		
	}
}