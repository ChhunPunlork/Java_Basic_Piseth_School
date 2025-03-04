package Lork.java.Order;

import java.util.ArrayList;
import java.util.List;

import Lork.java.Customer.Customers;
import Lork.java.GtSt.Products;

public class Orders {
	private int id;
	private Customers customer;
	private List<Products> products = new ArrayList<>();
	
	public Orders(int id, Customers customer) {
		this.id = id;
		this.customer = customer;
		this.products = products;
	}
	public void addPro(Products product, int quantity) {
		for(Products p : products) {
			if(p.getProId() == product.getProId()) {
				p.setQuantity(p.getQuantity() + quantity);
			}
			return;
		}
		Products newpro = new Products(product.getProId(), product.getProName(), product.getProPrice(), quantity);
		products.add(newpro);
	}
	public void displayOrder() {
		System.out.println("Order Id: " + id);
		System.out.println("Custom  :  "+ customer.getName());
		for(Products p: products) {
			System.out.println("-" + p.getProName() +  "(" + p.getQuantity() + "pcs)");
		}
		System.out.println("Total pice = $" + calculateTotalPrice() );
	}
	private double calculateTotalPrice() {
		double totalPrice = 0;
		for(Products p : products){
			totalPrice = p.getProPrice() * p.getQuantity();
		}
		return totalPrice;
	}
	
}
