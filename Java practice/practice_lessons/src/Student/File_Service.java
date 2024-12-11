package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class File_Service {
	private static String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\Java practice\\Student.txt";
	
	public static void SaveToData(String data) {
		File file = new File(fileName);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			bufferedWriter.newLine();
			bufferedWriter.close();
			System.out.println("Successed");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}
