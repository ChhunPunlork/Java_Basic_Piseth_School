package Student;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class Student_Service {
	public static void register(Student student) {
		File_Service.SaveToData(student.toData());
	}
	public static void Showing() {
		Showfile.ShowData();	
	}
	
	public static void InputInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================Complete your information===================");
		System.out.print("\t Input your id: ");
		int id = sc.nextInt();
		System.out.print("\t Input your name: ");
		String name = sc.next();
		System.out.print("\t Input your gender: ");
		String gender = sc.next();
		System.out.print("\t Input your address: ");
		String address = sc.next();
		
		if(name == null) {
			throw new RuntimeException("Your name is null, please input your name");
		}else if(gender == null) {
			throw new RuntimeException("Your gender is null, please input your gender");
		}else if(address == null) {
			throw new RuntimeException("Your address is null, please inout your address");
		}else {
			Student student = new Student(id, name, gender, address);
			register(student);
		}
	}
//	public static void findData() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input id to find student: ");
//		int id = sc.nextInt();
//		//FindingData.findStudentById(id);
//	}
	
	public static void FindDataByID(int Id) {
		FindingData.findbyId(Id);
	}
	
	public static void OptionIn2() {
		System.out.println("================To find student==============");
		System.out.println("\t1. To find all student's infomation.");
		System.out.println("\t2. To find by Id.");
	}
	
	 public static void MainHeader() {
		 System.out.println("===============Welcome to Norton University=============");
			System.out.println("\t1.To complete infomation.");
			System.out.println("\t2.To check student's infomations.");
			System.out.println("\t3.To exit.");
	 }
}
