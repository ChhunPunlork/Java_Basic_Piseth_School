package PhoneDemo;

import java.util.Scanner;

public class Main {
	private static final String fileName = "C:\\Users\\Asus\\OneDrive\\Desktop\\PhoneShopData.txt";

	public static void main(String[] args) {
		PhoneShop shop = new PhoneShop();
		shop.loadFromFile(fileName);

		Scanner scanner = new Scanner(System.in);
		String command;

		do {
			System.out.println("\nPhone Shop Menu:");
			System.out.println("1. Add Phone");
			System.out.println("2. List Phones");
			System.out.println("3. Remove Phone");
			System.out.println("4. Search Phone");
			System.out.println("5. Save and Exit");
			System.out.print("Enter your choice: ");
			command = scanner.nextLine();

			switch (command) {
			case "1":
				System.out.print("Enter phone model: ");
				String model = scanner.nextLine();
				System.out.print("Enter phone brand: ");
				String brand = scanner.nextLine();
				System.out.print("Enter phone price: ");
				double price = scanner.nextDouble();
				scanner.nextLine(); // Consume newline
				Phone phone = new Phone(model, brand, price);
				shop.AddPhone(phone);
				System.out.println("Phone added.");
				break;
			case "2":
				System.out.println("List of Phones:");
				shop.ListPhone();
				break;
			case "3":
				System.out.print("Enter phone model to remove: ");
				model = scanner.nextLine();
				shop.RemovePhone(model);
				System.out.println("Phone removed.");
				break;
			case "4":
				System.out.print("Enter phone model to search: ");
				model = scanner.nextLine();
				Phone searchedPhone = shop.SearchPhone(model);
				if (searchedPhone != null) {
					System.out.println("Found phone: " + searchedPhone);
				} else {
					System.out.println("Phone not found.");
				}
				break;
			case "5":
				shop.saveToFile(fileName);
				System.out.println("Data saved. Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (!command.equals("5"));

		scanner.close();
	}

}
