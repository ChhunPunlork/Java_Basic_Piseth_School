package Generics.Java;

import java.util.ArrayList;
import java.util.List;

public class Generic_Inheritance {

	public static void main(String[] args) {
		String str = "Dara";
		Object object = new Object();

		object = str;
//		System.out.println(object);
		Piseth<String> strG = new Piseth<>();
		Piseth<Object> objG = new Piseth<>();

//		object = objG;
//		System.out.println(objG);

		Heng<Object> S1 = new Heng<>();
		objG = S1;

		Smak<String, Integer> st = new Smak<>();
		strG = st;
		
		List<Integer> list = new ArrayList<Integer>();
		
	}

	static class Piseth<T> {

	}

	static class Heng<T> extends Piseth<T> {

	}

	static class Smak<T, E> extends Piseth<T> {

	}

}
