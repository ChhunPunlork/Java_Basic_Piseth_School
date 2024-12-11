package Student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
//		boolean exit = true;
//	Student_Service student_Service = new Student_Service();
//		Scanner sc = new Scanner(System.in);
//		student_Service.MainHeader();
//		System.out.print("Option :");
//		int option = sc.nextInt();
		boolean exit = true;
		while (exit) {
			Student_Service student_Service = new Student_Service();
			Scanner sc = new Scanner(System.in);
			student_Service.MainHeader();
			System.out.print("Option :");
			int option = sc.nextInt();
			if (option == 1) {
				student_Service.InputInfo();
			} else if (option == 2) {
				Student_Service.OptionIn2();
				System.out.print("Option: ");
				int optionlatter = sc.nextInt();
				if (optionlatter ==1) {
					student_Service.Showing();
				} else if (optionlatter == 2) {
					System.out.print("Please input student's id you want to find: ");
					int ID = sc.nextInt();
					student_Service.FindDataByID(ID);
				}

			} else if (option == 3) {
				exit = false;
			}
		}
//	student_Service.findData();

	}

}
