package function_Interface_Demo;

import java.util.function.Function;

import function_Interface_impl.AddFive;
import function_Interface_impl.AddFiveImpl;
import function_Interface_impl.AddNumber;

public class FunctionalDemo {

	public static void main(String[] arqs) {
		
		Function<String, Integer> FTLength = txt -> txt.length();
		Function<Integer, Integer> Mypower = no -> no*no;
		int powerToString = FTLength.andThen(Mypower).apply("Lork");
		System.out.println(powerToString);
		
	}

}