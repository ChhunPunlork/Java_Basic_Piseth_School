package Lork.java;

public class withoutGenaric {
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		withoutGenaric type = new withoutGenaric();
		type.setValue("Lork");
		String str = (String) type.getValue();
		System.out.println(str);
	}
}
 