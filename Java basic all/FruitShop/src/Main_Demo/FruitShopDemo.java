package Main_Demo;

import Main_Demo_FileSevice.File_Service;

public class FruitShopDemo {
	public static void main(String[] arqs) {
		Fruit_Shop_Service service = new Fruit_Shop_Service();
		File_Service file_Service = new File_Service();
//		service.AddFruit("Banana", 2.0, 3);
//		service.ListFruit();
		file_Service.AddToFile("Banana",2.00, 10);
		
	}
}
