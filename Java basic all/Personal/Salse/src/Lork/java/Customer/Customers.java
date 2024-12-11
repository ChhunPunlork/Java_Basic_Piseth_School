package Lork.java.Customer;

public class Customers {
	private int id;
    private String name;
    private String gender;
    private String contactInfo;
    
	public Customers(int id, String name, String gender, String contactInfo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.contactInfo = contactInfo;
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
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", gender=" + gender + ", contactInfo=" + contactInfo + "]";
	}
}
