package RegisterVoter;

import java.time.LocalDate;
import java.util.Scanner;

public class VoterApp {
	public static void main(String[] arqs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id: ");
		long id = sc.nextLong();
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your gender: ");
		String gender = sc.next();
		System.out.println("Enter your date of birth: ");
		int year = sc.nextInt(), month = sc.nextInt(), day = sc.nextInt();
		System.out.println("Enter you idCard: ");
		String idcard = sc.next();
		
		Person person = new Person(id, name, gender, LocalDate.of(year, month, day), idcard);
		
		VoterService voterService = new VoterService();
		voterService.register(person);
		
		voterService.displayVoter();
	}
}
