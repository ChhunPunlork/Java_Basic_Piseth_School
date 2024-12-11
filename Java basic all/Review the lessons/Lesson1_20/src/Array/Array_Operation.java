package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array_Operation {
	public static void main(String[] arqs) {
		addNewElement();
	}
	
	public static void addNewElement() {
		int a[] = {23, 34 , 59, 90};
				//new element = 38
				//a ={23, 34 , 59, 90, 38}
				int element = 38;
		int b[] = new int[a.length+1];
		//display
		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		
		//step copy
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("=========================");
		b[b.length-1] = element;
		//display again
		a = b;
		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
	}
}
