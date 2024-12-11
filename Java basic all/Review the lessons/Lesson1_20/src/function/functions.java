package function;

import java.util.Arrays;
import java.util.Scanner;import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class functions {

	public static void main(String[] args) {
//		int a[] = {10, 20, 30, 40, 50};
//		int b[] = {100, 200, 300, 400, 500};
//		Scanner sc = new Scanner(System.in);
//		boolean text = true;
//		while (text) {
//			System.out.println("Please enter number:");
//			System.out.println("\1.To input the country");
//			System.out.println("\2.To close");
//			System.out.println("===========================");
//			System.out.print("Enter here: ");
//			int Num = sc.nextInt();
//			if (Num == 1) {
//				System.out.println("==============Country===============");
//				System.out.println("Please enter country name: ");
//				String countryName = sc.next();
//				printArrasys(countryName);
//			}
//			if(Num == 0) {
//				text = false;
//			}
//		}
//		int a[] = {10, 20, 30, 40, 50};
//		int b[] = {100, 200, 300, 400, 500};
//		int total = getSumArray(b) +  getSumArray(a);
//		System.out.println(total);
//		findingMaxNum(b);
//		getArray(3);
		
		int t = power(2, 3) + power(5,2);
		System.out.println(t);
	}
	
	public static int power(int n, int m) {
		int result = 1;
		for(int i=0; i<m; i++) {
			result = result * n;
		}
		System.out.println(result);
		return result;
	}
	
	public static int getSumArray(int [] arr) {
		int total = 0;
		for(int n : arr) {
			total = total + n;		
		}
		return total;
	}
	
	public static void getArray(int n) {
		Scanner sc = new Scanner(System.in);
		int []arr = new int [n];
		for(int i=0; i<n; i++) {
			System.out.print("Element " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}
		printArray(arr);
	}
	
	public static void findingMaxNum(int arr[]) {
		int maxNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println(maxNum);
	}

	public static void printArrayElement() {
		int a[] = { 10, 20, 30, 40, 50 };

		for (int n : a) {
			System.out.println(n);
		}
	}

	public static void SumArray() {
		int total = 0;
		int a[] = { 10, 20, 30, 40, 50 };
		for (int n : a) {
			total += n;
		}
		System.out.println(total);
	}

	public static void printArray(int a[]) {
		for (int n : a) {
			System.out.print(n + ", ");
		}
	}

	public static void printArrasys(String countryName) {
		System.out.println("=======Welcome to " + countryName + "==========");
	}
}
