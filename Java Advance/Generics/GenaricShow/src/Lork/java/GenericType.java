package Lork.java;

public class GenericType<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		GenericType<String> type = new GenericType<>();
		type.setValue("Lork");
		
		String str = (String) type.getValue();
		System.out.println(str);
		
		GenericType<Integer> type2 = new GenericType<>();
		type2.setValue(20);
		Integer st = (Integer) type2.getValue();
		System.out.println(st);
	}
}
