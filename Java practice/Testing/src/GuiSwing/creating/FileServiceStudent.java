package GuiSwing.creating;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileServiceStudent {
	private static String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\Java practice\\Student.txt";

	public static void SaveFile( String name, String gender, String grade, String age) {
		File file = new File(fileName);
		try {
			Writer writer = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(".Name: " + name + ", gender: " + gender + ", grade: " + grade + ", age: " + age);
			bufferedWriter.newLine();
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
