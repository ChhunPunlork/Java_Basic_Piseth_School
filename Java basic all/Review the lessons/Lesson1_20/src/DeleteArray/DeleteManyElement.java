package DeleteArray;

import java.util.Arrays;

public class DeleteManyElement {
	public static void main(String[] arqs) {
		RemoveManyElement();
	}

	public static void RemoveManyElement() {
		int a[] = { 10, 40, 20, 30, 40, 40 };
		int valueTodelete = 40;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == valueTodelete) {
				count++;

			}
		}
		int[] b = new int[a.length - count];
		int Index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != valueTodelete) {
				b[Index] = a[i];
				Index++;
			}
		}
		System.out.println("Quantity of 40 = " + count);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
