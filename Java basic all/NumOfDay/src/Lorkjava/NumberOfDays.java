package Lorkjava;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] arqs) {

		int NumberOfDay = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input number of month: ");
		int NumberOfMonth = sc.nextInt();
		switch(NumberOfMonth) {
		case 1: NumberOfDay = 31;break;
		case 2:
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please input number of year: ");
			int NumberOfYear = scanner.nextInt();
			if(NumberOfYear % 4 == 0) {
				NumberOfDay = 29;
			}
			else {
				NumberOfDay = 28;
			}
			break;
		case 3: NumberOfDay = 31;break;
		case 4: NumberOfDay = 30;break;
		case 5: NumberOfDay = 31;break;
		case 6: NumberOfDay = 30;break;
		case 7: NumberOfDay = 31;break;
		case 8: NumberOfDay = 30;break;
		case 9: NumberOfDay = 31;break;
		case 10: NumberOfDay = 30;break;
		case 11: NumberOfDay = 31;break;
		case 12: NumberOfDay = 30;break;
		}
		System.out.println("Month " + NumberOfMonth + " : " + NumberOfDay  + "days" );
	}	
}
