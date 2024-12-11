package PhoneDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PhoneShop implements Serializable {
	private List<Phone> phones;
	private Long SerializableUID = 1L;

	public PhoneShop() {
		phones = new ArrayList<>();
	}

	public void AddPhone(Phone phone) {
		phones.add(phone);
	}

	public void ListPhone() {
		if (phones.isEmpty()) {
			System.out.println("Not phones available");
		} else {
			for (Phone phone : phones) {
				System.out.println(phone);
			}
		}
	}

	public void RemovePhone(String model) {
		phones.removeIf(phones -> phones.getModel().equals(model));
	}

	public Phone SearchPhone(String model) {
		for(Phone phone: phones) {
			if(phone.getModel().equalsIgnoreCase(model)) {
				return phone;
			}
		}
		return null;
		
	}
	

	  public void saveToFile(String filename) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
	            for (Phone phone : phones) {
	                writer.write(phone.getModel() + "," + phone.getBrand() + "," + phone.getPrice());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
//	public static PhoneShop LoadToFile(String FileName) {
//		PhoneShop shop = null;
//		try {
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FileName));
//			shop = (PhoneShop) ois.readObject();
//		} catch (IOException | ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//		
//		
//		return shop == null ? new PhoneShop() : shop;
//	}
	  public void loadFromFile(String filename) {
	        phones = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length == 3) {
	                    String model = parts[0];
	                    String brand = parts[1];
	                    double price = Double.parseDouble(parts[2]);
	                    phones.add(new Phone(model, brand, price));
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
