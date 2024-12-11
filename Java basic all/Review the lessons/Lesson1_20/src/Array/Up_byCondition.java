package Array;

import java.util.Arrays;

public class Up_byCondition {

	public static void main(String[] arqs) {
		UpdateElement();
	}

	public static void UpdateElement() {
		int a[] = { 10,56, 70, 60, 74};
		System.out.println(Arrays.toString(a));

		for(int i=0; i< a.length; i++) {
			if(a[i] > 60) {
				a[i] = a[i] + 20;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
