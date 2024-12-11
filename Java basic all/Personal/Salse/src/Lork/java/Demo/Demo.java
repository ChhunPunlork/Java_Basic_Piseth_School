package Lork.java.Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lork.java.Customer.Customers;
import Lork.java.GtSt.Products;
import Lork.java.Order.Orders;

public class Demo {
	private static List<Products> products = new ArrayList<>();
	private static List<Customers> customers = new ArrayList<>();
	private static List<Orders> orders = new ArrayList<>();
	private static int proCounter = 1;
	private static int custCounter = 1;
	private static int orderCounter = 1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		initializeSampleData();
		boolean exit = false;
		while (!exit) {
			System.out.println("Welcome to Mart Management System");
			System.out.println("1. Add Product");
			System.out.println("2. Add Customer");
			System.out.println("3. Place Order");
			System.out.println("4. Display All Products");
			System.out.println("5. Display All Customers");
			System.out.println("6. Display All Orders");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline character
			switch (choice) {
				case 1:
					addPro(scanner);
					break;
				case 2:
					addCustomer(scanner);
					break;
				case 3:
					placOrder(scanner);
					break;
				case 4:
					displayAllPros();
					break;
				case 5:
					displayAllCustomers();
					break;
				case 6:
					displayAllOrders();
					break;
				case 7:
					exit = true;
					System.out.println("Exiting Mart System. Good bye! Thank you!");
				default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
			}
		}
	}
	private static void addPro(Scanner scanner) {
		System.out.println("Enter product name: ");
		String proName = scanner.nextLine();
		System.out.println("Enter product price: ");
		double proPrice = scanner.nextDouble();
		System.out.println("Enter initial quantity: ");
		int quantity = scanner.nextInt();
		
		Products newPro = new Products(proCounter++, proName, proPrice, quantity);
		products.add(newPro);
		System.out.println("Product added successfully.");
		System.out.println("----------------------------------------");
	}
	private static void addCustomer(Scanner scanner) {
		System.out.println("Enter customer name: ");
		String custName = scanner.nextLine();
		System.out.println("Enter customer gender: ");
		String custGender = scanner.nextLine();
		System.out.println("Enter customer contact information: ");
		String custCont = scanner.nextLine();
		
		Customers newCustomers = new Customers(custCounter++, custName, custGender, custCont);
		customers.add(newCustomers);
		System.out.println("Customers added successfully.");
		System.out.println("----------------------------------------");
	}
	private static void placOrder(Scanner scanner) {
		System.out.println("Enter customer Id: ");
		int custId = scanner.nextInt();
		 Customers customers = findCustomersById(custId);
		 if(customers == null) {
			 System.out.println("Customers no found.");
			 return;
		 }
		 Orders order = new Orders(orderCounter++, customers);

	        boolean continueAdding = true;
	        while (continueAdding) {
	            displayAllPros();
	            System.out.print("Enter product ID to add to order (0 to finish): ");
	            int proId = scanner.nextInt();
	            if (proId == 0) {
	                continueAdding = false;
	            } else {
	                Products products = findProductsById(proId);
	                if (products == null) {
	                    System.out.println("Product not found.");
	                } else {
	                    System.out.print("Enter quantity: ");
	                    int quantity = scanner.nextInt();
	                    order.addPro(products, quantity);
	                    System.out.println("Product added to order.");
	                }
	            }
	        }
	}
	private static Customers findCustomersById(int id) {
	    for (Customers cust : customers) {
	        if (cust.getId() == id) {
	            return cust;
	        }
	    }
	    return null;
	}
	private static Products findProductsById(int id) {
		 for (Products prod : products) {
		        if (prod.getProId() == id) {
		            return prod;
		        }
		    }
	    return null; 
	}
	
	private static void displayAllPros() {
		System.out.println("Products: ");
		for(Products p : products) {
			System.out.println(p);
		}
		System.out.println("---------------------------------------");
	}
	private static void displayAllCustomers() {
		System.out.println("Customers: ");
		for(Customers cm : customers) {
			System.out.println(cm);
		}
		System.out.println("---------------------------------------");
	}
	private static void displayAllOrders() {
	        if (orders.isEmpty()) {
	            System.out.println("No orders placed yet.");
	        } else {
	            System.out.println("Orders:");
	            for (Orders o : orders) {
	                o.displayOrder();
	            }
	        }
		System.out.println("---------------------------------------");
	}
	private static void initializeSampleData() {
        // Adding some sample products
        products.add(new Products(proCounter++, "Laptop", 999.99, 5));
        products.add(new Products(proCounter++, "Mobile Phone", 499.99, 10));
        products.add(new Products(proCounter++, "Printer", 149.99, 3));

        // Adding some sample customers
        customers.add(new Customers(custCounter++, "Alice","Famale", "alice@email.com"));
        customers.add(new Customers(custCounter++, "Bob","Famale", "bob@email.com"));
    }
}
