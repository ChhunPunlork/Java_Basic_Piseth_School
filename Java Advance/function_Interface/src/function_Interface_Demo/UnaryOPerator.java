package function_Interface_Demo;

import java.nio.file.spi.FileSystemProvider;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOPerator {

	public static void main(String[] args) {
		
		UnaryOperator<String> toUpper = text -> text.toUpperCase();
		String upper = toUpper.apply("lork");
		System.out.println(upper);
		
		//======================================================
		System.out.println("========UnaryOP=========");
		UnaryOperator<Integer> power = n -> n*n;
		System.out.println(power.apply(5));
		
		
		Function<String, Integer> length = t -> t.length();
		Function<Integer, Integer> MyPower = p -> p * p;
		
		int toLength = length.apply("Lork");
		int mypower = MyPower.apply(toLength);
		
		System.out.println(toLength);
		System.out.println(mypower);
		
	}

}
