package functional_Interface_java_Demo;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface_Demo {
	public static void main(String[] arqs) {

		Function<String, Integer> getLength = new ToLength();
		int length = getLength.apply("ChhunLorkS");
		System.out.println(length);

		Function<String, Integer> getLength2 = (String name) -> name.length();
		System.out.println(getLength2.apply("Lork"));
		// ================================ Lamda ==================================
		Function<String, Character> FirstChar = (String text) -> text.charAt(0);
		System.out.println(FirstChar.apply("Cheata"));

		// 4 = 6
		// 3 = 9

		Function<Integer, Integer> power = n -> n * n;
		System.out.println(power.apply(3));
		System.out.println(power.apply(4));
	}

	static class ToLength implements Function<String, Integer> {

		@Override
		public Integer apply(String t) {

			return t.length();
		}

	}
}
