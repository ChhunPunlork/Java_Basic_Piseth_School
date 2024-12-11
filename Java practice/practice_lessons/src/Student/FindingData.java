package Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindingData {
	static File fileName = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Java practice\\Student.txt");

	public static void findbyId(int studentId) {
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null) {
				String []field = line.split(", ");
				if(line.length() > 0) {
					int currentId = Integer.parseInt(field[0].trim());
					if (currentId == studentId) {
	                    // Print the entire line if the ID matches
	                    System.out.println("Student found: " + line);
	                    return; // Exit the method after finding the student
	                }
				}
				System.out.println("Student with ID " + studentId + " not found.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
