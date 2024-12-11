package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Throws {

	public static void main(String[] args){
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not found the file");
		}
	}
	public static void readFile() throws FileNotFoundException {
		File file = new File("D:\\\\Java Project\\\\Person.txta");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
	}
	public static void readFile2() {
		File file = new File("D:\\\\Java Project\\\\Person.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
