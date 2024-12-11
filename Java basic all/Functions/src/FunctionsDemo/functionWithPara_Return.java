package FunctionsDemo;

import java.util.Scanner;

public class functionWithPara_Return {
	public static void main(String[] arqs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.print("====Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("=====Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("=====================================");
		System.out.println("=====================================");
		double total = MultiNum(num1, num2);
		System.out.println("=========Total : " + total);
	}
	public static double MultiNum(int num1, int num2) {
		double total = num1 * num2;
		return total;
	}
}
