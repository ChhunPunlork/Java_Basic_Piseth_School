package Lork.test.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Comparator<Integer> compare = (p1, p2) -> p1 - p2;
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(23);
//		list1.add(15);
//		list1.add(42);
//		list1.add(10);
//		list1.add(12);
//		list1.add(87);
//		list1.add(145);
//		list1.add(123);
//		list1.add(67);j
//		Collections.sort(list1, compare);
//		System.out.println(list1);
		
		List<Student> st = List.of(
				new Student("Lork", "M", 21),
				new Student("Dom", "M", 21),
				new Student("Pheak", "M", 24),
				new Student("Rong", "M", 15),
				new Student("Maov", "F", 27),
				new Student("Torng", "F", 20),
				new Student("Horn", "F", 29)
				);
		
		st.stream()
		.filter(gd -> gd.getGender() == "F")
		.forEach(sd -> System.out.print(sd + ", "));
		
		
	}

}
