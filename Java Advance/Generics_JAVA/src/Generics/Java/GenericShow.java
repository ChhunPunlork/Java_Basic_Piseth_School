package Generics.Java;

import java.util.ArrayList;
import java.util.List;

public class GenericShow {
	public static void main(String[] arqs) {
		List<String> list = new ArrayList<String>();
		list.add("Lork");
//		list.add(Integer.valueOf(5));
		for(String str : list) {
//			String str = (String)obj;
			System.out.println(str);
		}
		
		
		
	}
}
