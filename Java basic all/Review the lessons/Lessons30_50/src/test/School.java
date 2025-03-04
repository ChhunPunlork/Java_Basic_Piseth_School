package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
	private String name;
	private ArrayList<Student> students = new ArrayList<Student>();

	public void register(Student student) {
		students.add(student);
	}
	
	public void displayStudent() {
		for(Student student : students) {
			System.out.println("\tId: %d, Name: %s , Gender: %s".formatted(student.getId(), student.getName(), student.getGender()));
		}
	}
	
	public void SortByName() {
		Comparator<Student> comparator = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		students.sort(comparator);
	}

	public String getName() {
		return name;
	}

	public Student findById(int studentId) {
		for(Student student : students) {
			if(student.getId() == (studentId)) {
				return student;
			}
		}
		return null;
	}

//	public void updateStudent(int studentId, String studentName) {
//		Student studentid = findById(studentId);
//		for(Student student : students) {
//			if(student.getId() == studentid) {
//				
//			}
//		}
//	}
//	
	public void RemoveById(int studentId) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == studentId) {
				iterator.remove();
			}
		}
	}
	
	public void updateStudent(int studentId, Student NewStudent) {
		Student student = findById(studentId);
		if(student != null) {
			student.setGender(NewStudent.getGender());
			student.setName(NewStudent.getName());
		}
		else {
			System.out.println("Not foud student");
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
