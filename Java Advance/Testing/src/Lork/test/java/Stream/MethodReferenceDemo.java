package Lork.test.java.Stream;

public class MethodReferenceDemo {
	public static void main(String[] arqs) {
		MTRF mtrf = (txt) -> System.out.println(txt);
		mtrf.display("Lork");
	}
}
