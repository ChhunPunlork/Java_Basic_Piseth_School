package Lork.java;

import java.util.Scanner;

public class Multiplication_Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input main number: ");
		int Num = sc.nextInt();
		for(int i=1; i <= Num; i++) {
			System.out.println("==================================");
			for(int j=1 ; j<=10 ; j++) {
				System.out.println("\t" + i + " * " + j + " = " + i*j);
			}
		}
		
	}

}
