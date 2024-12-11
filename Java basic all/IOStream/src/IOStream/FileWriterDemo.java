package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\IOData.txt";
		int data;
		FileWriter fileWriter = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fileWriter = new FileWriter(fileName, true);
//			System.out.print("Please enter data: ");
//			String txt = sc.next();
			String txt = "Chhun Punlork";
			fileWriter.write(txt);
			fileWriter.close();
			System.out.println("Successed!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
