package IO_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] arqs) {
		char[] data = new char[100];
		try {
			Reader reader = new FileReader("D:\\\\Java Project\\\\file for text\\\\OutputStr.txt");
			System.out.println(reader.ready());
			reader.read(data);
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
