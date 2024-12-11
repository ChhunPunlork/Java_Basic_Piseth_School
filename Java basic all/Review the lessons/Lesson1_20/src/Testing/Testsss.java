package Testing;

import java.util.Arrays;
import java.util.Scanner;

public class Testsss {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Input num: ");
//		int n = sc.nextInt();
//		System.out.print("Input multi: ");
//		int m = sc.nextInt();
//		int result = power(n, m);
//		System.out.println(n + " ^* " + m + " = " + result);
//		int qty = sc.nextInt();
//		String country = sc.next();
//		String Print = Country(qty, country); 
//		System.out.println(Print);
		System.out.print("Input quantity: ");
		int qty = sc.nextInt();
		for (int j = 1; j <= qty; j++) {
			System.out.print(j + ". ");
			Country(qty);
		}
		
	}

	public static void addIndex() {
		int a[] = { 10, 20, 30, 40, 50 };
		int indexToAdd = 5;
		int NewValue = 70;
		int b[] = new int[a.length + 1];
		for (int i = 0; i < indexToAdd; i++) {
			b[i] = a[i];
		}
		b[indexToAdd] = NewValue;
		for (int i = indexToAdd + 1; i < b.length; i++) {
			b[i] = a[i - 1];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	public static void DeleteByIndex() {
		int a[] = { 10, 20, 30, 30, 40, 50 };
		int IndexToDelete = 2;
		int b[] = new int[a.length - 1];
		for (int i = 0; i < IndexToDelete; i++) {
			b[i] = a[i];
		}
		for (int i = IndexToDelete; i < b.length; i++) {
			b[i] = a[i + 1];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	public static void shortingArray() {

		int a[] = { 12, 34, 56, 45, 23, 76, 57, 34 };
		int tmd;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmd = a[i];
					a[i] = a[j];
					a[j] = tmd;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void UpByCondition() {

		int a[] = { 10, 40, 30, 24, 90 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmd = a[i];
					a[i] = a[j];
					a[j] = tmd;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 30) {
				a[i] += 20;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void ArrOperation() {
		int a[] = { 10, 20, 30, 40, 50, 60 };
		int b[] = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = 70;
		System.out.println(Arrays.toString(b));
	}

	public static int power(int n, int m) {
		int result = 1;
		for (int i = 0; i < m; i++) {
			result *= n;
		}
		return result;
	}

	public static void Country(int qty) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Country: ".toUpperCase());
		String country = sc.next().toUpperCase();
	}
}