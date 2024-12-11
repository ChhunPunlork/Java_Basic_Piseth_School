package Array;

import java.util.Arrays;

public class addIndex {
	public static void main(String[] arqs) {
		AddIndex();
	}
	public static void AddIndex() {
		int a[] = {10, 20, 40, 50, 60};
		int IndexToAdd = 2;
		int Newvalue =  30;
		
		//step 1
		int []b = new int [a.length+1];
		//step2
		for(int i=0; i<IndexToAdd; i++) {
			b[i] = a[i];
		}
		//step3
		b[IndexToAdd] = Newvalue;
		
		//step4
		for(int i=IndexToAdd+1; i<b.length; i++) {
			b[i] = a[i-1];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
