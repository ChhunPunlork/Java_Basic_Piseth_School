package Main_Demo_FileSevice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Main_Demo.Fruit;
import Main_Demo.Fruit_Shop_Service;

public class File_Service {
	private final String FileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\FruitData.txt";
	private Fruit_Shop_Service service = new Fruit_Shop_Service();
	public void AddToFile(String name, double price, int quatity) {
		try {
			FileWriter fileWriter = new FileWriter(FileName);
			fileWriter.write(name);
			fileWriter.write((int) price);
			fileWriter.write(quatity);
			service.AddFruit(name, price, quatity);
			fileWriter.close();
			System.out.println("Write successed!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void ReadFromFile() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(FileName);
			int readData = fileReader.read();
			while(readData != -1) {
				System.out.println((char)readData);
			}
			fileReader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
