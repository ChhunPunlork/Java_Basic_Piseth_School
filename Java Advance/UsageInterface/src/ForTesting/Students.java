package ForTesting;

public class Students {
	private String name;
	private String gender;
	private int age;

	public Students(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
//		return "Students [name=" + name + ", gender=" + gender + ", age=" + age + "]";
		return name + " "+age;
	}
	

}
