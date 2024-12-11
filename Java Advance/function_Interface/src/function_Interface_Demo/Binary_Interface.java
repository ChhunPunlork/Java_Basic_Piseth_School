package function_Interface_Demo;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Binary_Interface {

	public static void main(String[] args) {
	
		BiFunction<String, Integer, Integer> lengthAndPower = (txt, power) -> (int)Math.pow(txt.length(), power);
		int p = lengthAndPower.apply("Dara", 3);
		System.out.println(p);
	}

}
