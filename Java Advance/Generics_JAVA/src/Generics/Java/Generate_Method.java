package Generics.Java;

import java.util.ArrayList;
import java.util.List;

public class Generate_Method {
//	public static void main(String[] arqs) {
//		
//	}
	public static <T> boolean isEqual(GenerateType<T> t1, GenerateType<T> t2) {
		return t1.getValue().equals(t2.getValue());
	}
	public static <T> List <T> combine(List<T> list1, List<T> list2){
		
		List<T> result = new ArrayList<>();
		result.addAll(list1);
		result.addAll(list2);
		return result;
	}
	

	public static void main(String[] arqs) {
		
//		GenerateType<Integer> t1 = new GenerateType<>();
//		
//		GenerateType<Integer> t2 = new GenerateType<>();
//		
//		t1.setValue(5);
//		t2.setValue(5);
//		
//		boolean test = Generate_Method.isEqual(t1, t2);
//		System.out.println(test);
		List<String> list1 = new ArrayList<>();
		list1.add("Test");
		list1.add("Test2");
		
		List<String> list2 = new ArrayList<>();
		list2.add("Test3");
		list2.add("Test4");
		
		List<String> result = combine(list1,list2);
		System.out.println(result);
	}
}
