package FunctionsDemo;

public class FunctionWithPara_NoReturn {
	public static void main(String[] arqs) {
		FunctionWithPara_NoReturn functionWithPara_NoReturn = new FunctionWithPara_NoReturn();
		functionWithPara_NoReturn.paraFunct(10, 20);
	}
	public void paraFunct(int num1, int num2) {
		int total = num1 + num2;
		System.out.println(total);
	}
}
