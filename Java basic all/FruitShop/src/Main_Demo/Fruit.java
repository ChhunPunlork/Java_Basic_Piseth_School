package Main_Demo;

import java.io.Serial;

public class Fruit {
	private int fruitCode;
	private String Fruitname;
	private double FruitPrice;
	private int FruitQuatity;

	public Fruit(String fruitname, double fruitPrice, int fruitQuatity) {
		super();
		Fruitname = fruitname;
		FruitPrice = fruitPrice;
		FruitQuatity = fruitQuatity;
	}

	public String getFruitname() {
		return Fruitname;
	}

	public void setFruitname(String fruitname) {
		Fruitname = fruitname;
	}

	public double getFruitPrice() {
		return FruitPrice;
	}

	public void setFruitPrice(double fruitPrice) {
		FruitPrice = fruitPrice;
	}

	public int getFruitQuatity() {
		return FruitQuatity;
	}

	public void setFruitQuatity(int fruitQuatity) {
		FruitQuatity = fruitQuatity;
	}

	@Override
	public String toString() {
		return "Fruit [" + "Fruitname= " + Fruitname + ", FruitPrice=" + FruitPrice
				+ ", FruitQuatity=" + FruitQuatity + "]";
	}

}
