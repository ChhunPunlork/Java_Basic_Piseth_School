package Lork.java;

import java.util.HashMap;
import java.util.Map;

public class CuurencyConverter {
	private static Map<String, Double> ExchageRate = new HashMap<>();
	static {
		ExchageRate.put("USD", 1.00);
		ExchageRate.put("EUR", 0.85);
		ExchageRate.put("JPY", 110.0);
		ExchageRate.put("GBP", 0.75);
		ExchageRate.put("RIEL", 4100.00);
	}

	public static double Convert(String FromCurrency, String ToCurrency, double amount) {
		if (!ExchageRate.containsKey(FromCurrency) || !ExchageRate.containsKey(ToCurrency)) {
			throw new IllegalArgumentException("Invalid curren code!");
		}
		// convert to USD first then convert to target currency
		double AmountInUSD = amount / ExchageRate.get(FromCurrency);
		return AmountInUSD * ExchageRate.get(ToCurrency);
	}
}
