package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("Banana", 2);
		fruits.put("Mango", 3);
		fruits.put("Grape", 5);
		
		for(Map.Entry<String, Integer> fruit : fruits.entrySet()) {
			System.out.println(fruit.getKey() + fruit.getValue() + "$");
		}

	}

}
