package DeleteArray;

import java.util.Arrays;

public class DeleteByIndex {

	public static void main(String[] args) {
		RemoveElement();

	}
	public static void RemoveElement() {
		int a[] = {10, 20, 30, 40, 40};
		int IndexToDelete = 3;
		
		int b[] = new int[a.length-1];
		
		for(int i=0; i<IndexToDelete; i++) {
			b[i] = a[i];
		}
		
		for(int i=IndexToDelete; i<b.length; i++) {
			b[i] = a[i+1];
		}
		a=b;
		System.out.println(Arrays.toString(a));
	}
}
