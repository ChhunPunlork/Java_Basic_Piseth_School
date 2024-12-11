package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamDemo {
	private static String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\IOData.txt";

	public static void main(String[] arqs) {
		FileOutputStream outputStream = null;
		try {
			try {
				outputStream = new FileOutputStream(fileName, true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String txt = "Lork!";
			System.out.println("Successed!");
			try {
				outputStream.write(txt.getBytes());
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}
}
