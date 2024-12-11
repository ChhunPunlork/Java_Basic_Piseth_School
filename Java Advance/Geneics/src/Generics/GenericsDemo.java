package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
	//without generic
//	private Object value;
//	public Object getObject() {
//		return value;
//	}
//	public void setObject(Object value) {
//		this.value = value;
//	}
	public static <T>  boolean isEqual(GenericsType<T>t1,GenericsType<T>t2){
		return t1.getValue().equals(t2.getValue());
	}
	
	public static <T> List<T> combine(List<T> lt1, List<T> lt2){
		List<T> result = new ArrayList<>();
		result.addAll(lt1);
		result.addAll(lt2);
		return result;
	}
	
	public static void main(String[] arqs) {
		GenericsDemo demo = new GenericsDemo();
		List<String> lt1 = new ArrayList<>();
		List<String> lt2 = new ArrayList<>();
		lt1.add("Lork1");
		lt1.add("Lork2");
		lt2.add("Lork3");
		lt2.add("Lork4");
		List<String> result = combine(lt1, lt2);
		System.out.println(result);
		
		
		//GenericType
//		GenericsDemo demo = new GenericsDemo();
//		GenericsType<Integer> t1 = new GenericsType<>();
//		GenericsType<Integer> t2 = new GenericsType<>();
//		t1.SetValue(10);
//		t2.SetValue(10);
//		boolean test = demo.isEqual(t1, t2);
//		System.out.println(test);
		
//	GenericsDemo demo = new GenericsDemo();
//	demo.setObject("Lork");
//	System.out.println(demo.getObject());
	}
	
}
