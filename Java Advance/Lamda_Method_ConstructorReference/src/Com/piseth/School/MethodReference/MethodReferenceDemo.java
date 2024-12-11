package Com.piseth.School.MethodReference;

import Com.piseth.School.MyPrinter;

public class MethodReferenceDemo {

	public static void main(String[] args) {
//		Finder finder = new MyFinder();
//		String txt = "Welcome to Cambodia";
//		int index = finder.find(txt, "Cam");
//		System.out.println(index);
		
//		Finder finder2 = FindText::getIndexFromString;
//		int index2 = finder2.find("Dara is a student", "is");
//		System.out.println(index2);
		
//		Finder finder3 = (txt, txtTofind) -> txt.indexOf(txtTofind) + 20;
//		int no = finder3.find("abcd", "b");
//		System.out.println(no);
//		MyPrinter myPrinter = s -> System.out.println(s);
//		myPrinter.print("test Method");
//		
//		MyPrinter myPrinter2 = System.out::println;
//		myPrinter2.print("Hello dara");
//		
		//instance method
//		MyFinder2 finder2 = new MyFinder2();
//		Finder findernew = finder2::find;
//		System.out.println(findernew.find("I love Cambodia", "l"));
		
		//Constructor reference
		Finder finder = String::indexOf;
		int id = finder.find("Lork", "o");
		System.out.println(id);
		
	}

}
