package RegisterVoter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
	public static void Save(String data) {
		File file = new File("D:\\Java Project\\RegisterVoter\\Voter.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(data);
			//need to close
			bufferedWriter.close();
		} catch (IOException e) {
			System.out.println("Cannot find the file!");
			e.printStackTrace();
		}
	}
}
