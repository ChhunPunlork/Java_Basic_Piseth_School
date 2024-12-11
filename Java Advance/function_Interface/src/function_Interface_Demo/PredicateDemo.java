package function_Interface_Demo;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] arqs) {

		Predicate<String> ContainA = txt -> txt.contains("A");
		boolean ctA = ContainA.test("Dara".toUpperCase());
		System.out.println(ctA);
 	}

}
