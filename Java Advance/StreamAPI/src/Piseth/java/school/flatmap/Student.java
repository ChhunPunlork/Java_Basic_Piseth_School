package Piseth.java.school.flatmap;

import java.util.List;

public class Student {
	private String name;
	private int age;
	private List<String> subject;
	
	
	
	public Student(String name, int age, List<String> subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getSubject() {
		return subject;
	}
	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	
}
