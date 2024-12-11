package Array;

import java.util.Arrays;

public class SorttingArays {

	public static void main(String[] args) {
		//sorting 
		int a[] = {12,34,56,44,35,76,88,87,99};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int tmp = a[i];
					    a[i] = a[j];
					    a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}	

}
