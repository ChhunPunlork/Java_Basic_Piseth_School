package RegisterVoter;

import java.time.LocalDate;

public class Person {
	private long id;
	private String name;
	private String gender;
	private LocalDate dateOfbirdth;
	private String idCard;
	

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", gender=" + gender + ", dateOfbirdth=" + dateOfbirdth
				+ ", idCard=" + idCard + "]";
	}

	public Person(long id, String name, String gender, LocalDate dateOfbirdth, String idCard) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfbirdth = dateOfbirdth;
		this.idCard = idCard;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public LocalDate getDateOfbirdth() {
		return dateOfbirdth;
	}

	public void setDateOfbirdth(LocalDate dateOfbirdth) {
		this.dateOfbirdth = dateOfbirdth;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

}
