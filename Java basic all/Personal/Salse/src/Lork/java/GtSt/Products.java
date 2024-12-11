package Lork.java.GtSt;

public class Products{
	private String ProName;
	private int ProId;
	private double ProPrice;
	private int Quantity;
	public Products(int proId, String proName, double proPrice, int quantity) {
		super();
		ProName = proName;
		ProId = proId;
		ProPrice = proPrice;
		Quantity = quantity;
	}
	public String getProName() {
		return ProName;
	}
	public void setProName(String proName) {
		ProName = proName;
	}
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public double getProPrice() {
		return ProPrice;
	}
	public void setProPrice(double proPrice) {
		ProPrice = proPrice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Products [ProName=" + ProName + ", ProCode=" + ProId + ", ProPrice=" + ProPrice + ", Quantity="
				+ Quantity + "]";
	}
	
}
