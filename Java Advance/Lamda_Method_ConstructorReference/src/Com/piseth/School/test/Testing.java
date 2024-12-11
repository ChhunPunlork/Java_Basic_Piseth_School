package Com.piseth.School.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Testing {
	public static void main(String[] arqs) {
		//===========Zero parameter==========
//		ShowInfo info = new ShowInfo() {
//			
//			@Override
//			public void MyInfo() {
//				System.out.println("Lork");
//			}
//		};
//		info.MyInfo();
//		ShowInfo info = () -> System.out.println("Chhun Punlork");
//		info.MyInfo();
		
		//=============one parameter===========
		Printer printer = (String txt) -> System.out.println(txt);
		printer.print("Chhun Sokha");
		
		Comparator<Integer> comparator = (p1, p2) -> p2 - p1;
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(99);
		list.add(13);
		list.add(56);
		list.add(87);
		list.add(43);
		System.out.println(list);
		
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
