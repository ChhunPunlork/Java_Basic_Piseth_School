package PhoneDemo;

import java.io.Serializable;

public class Phone implements Serializable{
	private static long SerielVersionUID = 1L;
	private String model;
	private String brand;
	private double price;
	
	

	public Phone(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [model=" + model + ", brand=" + brand + ", price=$" + price + "]";
	}

	
}