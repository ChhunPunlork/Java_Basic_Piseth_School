package Lork.java;

import java.util.ArrayList;
import java.util.List;

public class GenericSubTyping {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<? extends Integer> list2 = new ArrayList<>();
		
		List<? extends Number> list = list1;
		list = list2;
	}
}
