package Lork.java;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] arqs) {
		Scanner sc = new Scanner(System.in);

		System.out.println("+++++++++++Welcome to currencies conveter+++++++++++".toUpperCase());
		System.out.println("====================================================");
		System.out.println("==Avalible currencies: EUR, USD, JPY, GBP and RIEL==".toUpperCase());
		System.out.println("====================================================");
		System.out.print("===Enter currency u want to convert from: ");
		String FromCurrency = sc.nextLine().toUpperCase();
		System.out.println("====================================================");
		System.out.print("===Enter currency u want to convert to: ");
		String ToCurrency = sc.nextLine().toUpperCase();
		System.out.println("====================================================");
		System.out.print("===Enter amount u want to convert: ");
		double amount = sc.nextDouble();
		System.out.println("====================================================");
		try {
			double convertedAmount = CuurencyConverter.Convert(FromCurrency, ToCurrency, amount);
			System.out.println("___________________________________________________");
			System.out.printf("|	 %.2f %s is equal to %.2f %s  \n", amount, FromCurrency, convertedAmount, ToCurrency);
			System.out.println("|_________________________________________________|");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}
}
