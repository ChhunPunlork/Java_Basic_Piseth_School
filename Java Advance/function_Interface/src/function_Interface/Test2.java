package function_Interface;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Test2 {
	public static void main(String[] arqs) {
		BiFunction<String, Integer, Integer> myPower = (txt, power) -> (int) Math.pow(txt.length(), power);
		int po = myPower.apply("Chhun", 2);
		System.out.println(po);
		
		
	}
}
