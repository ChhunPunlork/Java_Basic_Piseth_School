package Generics.Java;

import java.util.ArrayList;
import java.util.List;

public class Generic_Subtyping {
	public static void main(String[] arqs) {
		List<Integer> list = new ArrayList<>();
		List<? extends Number> list2 = list;
		
		List<? extends Integer> list3 = new ArrayList<>();
		list3 = list;
		
	
	}
}
