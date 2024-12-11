package Exception;

import javax.management.RuntimeErrorException;

public class Throw {
	public static void main(String[] arqs) {
		int age = 18;
		if(age < 18) {
			throw new RuntimeException("Cannot vote!");
		}
		System.out.println("Can vote");
	}
}	
