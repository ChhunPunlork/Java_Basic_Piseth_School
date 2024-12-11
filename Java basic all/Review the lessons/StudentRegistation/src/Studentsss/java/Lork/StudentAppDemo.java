package Studentsss.java.Lork;

public class StudentAppDemo {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Lork", Gender.MALE, 12);
		StudentService studentService = new StudentService();
		studentService.saveStudent(student1);
	}
}