package Lork.java.school;
import java.util.Scanner;


public class checking {
	public static void main(String[] args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your password: ");
		String password = sc.next();
		System.out.println("Please input your email: ");
		String email = sc.next();
		login(password, email);
		}
		
	}
	static void login(String password, String email) {
		if(password != null && email != null) {
			System.out.println("Your password: " + password);
			System.out.println("Your email   : " + email);
		}else if(password != null && email == null) {
			System.out.println("Invalid email!");
		}else if(password == null && email != null){
			System.out.println("Invalid password!");
		}else {
			System.out.println("Invalid password and email!");
		}
	}
}
