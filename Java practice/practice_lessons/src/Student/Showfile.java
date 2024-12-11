package Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Showfile {
	private static String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\Java practice\\Student.txt";

	public static void ShowData() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // Print each line of the file
			}
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
	}
}
