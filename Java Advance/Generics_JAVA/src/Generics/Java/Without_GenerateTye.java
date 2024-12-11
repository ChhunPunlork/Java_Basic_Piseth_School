package Generics.Java;

public class Without_GenerateTye {
	private Object object = new Object();
	public static void main(String[] args) {
		Without_GenerateTye type = new Without_GenerateTye();
//		type.setObject("Lork Pun Chhun");
		type.setObject(12);
		
		String str = (String) type.getObject();
		System.out.println(str);
		
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}

}
