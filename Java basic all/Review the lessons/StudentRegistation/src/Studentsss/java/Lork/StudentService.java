package Studentsss.java.Lork;

public class StudentService {
	public void saveStudent(Student student) {
		fileService.saveToFile(student.toData());
		System.out.println("Save succesfully");
	}
}
