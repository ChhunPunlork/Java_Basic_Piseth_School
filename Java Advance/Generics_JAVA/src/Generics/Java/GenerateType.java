package Generics.Java;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class GenerateType <T>{
	private T value;
	@SuppressWarnings("unchecked")
	public static void main(String[] arqs) {
		GenerateType<String> type = new GenerateType<String>();
		type.setValue("Dara");
		
		String str = type.getValue();
		System.out.println(str);
		
		@SuppressWarnings("rawtypes")
		GenerateType type2 = new GenerateType<>();
		type2.setValue(11);
		Integer no = (Integer) type2.getValue();
		System.out.println(no);
	}
	public T getValue() {
		return value;
	}
	public void setValue(T type) {
		this.value = type;
	}
	
	
}
