package JDBC.sql.java.Model;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int grade;

	public Student(String name, String gender, int grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public Student(int id, String name, String gender, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", grade=" + grade + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
