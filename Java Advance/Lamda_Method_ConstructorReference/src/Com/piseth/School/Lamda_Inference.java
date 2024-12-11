package Com.piseth.School;

public class Lamda_Inference {

	public static void main(String[] args) {
		MyPrinter myPrinter = (txt) -> System.out.println(txt);
		myPrinter.print("Lork");
	}

}
