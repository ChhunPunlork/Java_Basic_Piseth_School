package Lork.java;

import java.util.ArrayList;
import java.util.List;

public class GenericInheritance {
	public static void mian(String[] arqs) {
		String str = "dara";
		Object obj = new Object();
		obj = str;

		Piseth<String> strG = new Piseth<>();
		Piseth<Object> objG = new Piseth<>();
		
		obj = strG;
		
		Heng<Object> s1 = new Heng<>();
		objG = s1;
		
		Smak<String, Integer> s2 = new Smak<>();
		strG = s2;
	
		List<String> list = new ArrayList<>();
	
	}

	static class Piseth<T> {

	}

	static class Heng<T> extends Piseth<T> {
		
	}
	
	static class Smak<T, E> extends Piseth<T>{
		
	}
}
