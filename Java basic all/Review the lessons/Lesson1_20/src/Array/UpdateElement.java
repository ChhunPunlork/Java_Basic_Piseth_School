package Array;

import java.util.Arrays;

public class UpdateElement {
	public static void main(String[] arqs) {
		UpdateElement();
	}
	
public static void UpdateElement() {
	int a[] = {10, 20, 40, 40, 50, 60};
	int IndexToUpdate = 2;
	int Newvalue =  30;
	
	System.out.println(Arrays.toString(a));
	
	a[IndexToUpdate] = Newvalue;
	
	System.out.println(Arrays.toString(a));
	}
	
}
