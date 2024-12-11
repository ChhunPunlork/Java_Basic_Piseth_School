package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashMap {
	public static void main(String[] arqs) {
		Map<String, Double> MapFruit = new HashMap<>();
		MapFruit.put("Mango", 12.00);
		MapFruit.put("Banana", 12.00);
		MapFruit.put("Stebbury", 12.00);
		System.out.println(MapFruit);
		
		
//		MapFruit.keySet();
//		System.out.println(MapFruit.keySet());
//		System.out.println(MapFruit.values());
//		for(Entry<String, Double> entry : MapFruit.entrySet()) {
//			System.out.println(entry.getKey() + "==> " + entry.getValue());
//		}
		Map<String, Double> Map1 = new HashMap<>(MapFruit);
		Map1.put("Lork", 2000.0);
		System.out.println(Map1);
	}
}
