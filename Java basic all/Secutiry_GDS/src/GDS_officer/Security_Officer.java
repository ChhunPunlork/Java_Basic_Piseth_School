package GDS_officer;

public class Security_Officer {
	private int ID;
	private String name;
	private String gender;
	private String Reference;

	public Security_Officer(String name, String gender, String reference) {
		super();
		this.name = name;
		this.gender = gender;
		Reference = reference;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		Reference = reference;
	}

	@Override
	public String toString() {
		return "Officer info: [ID=" + ID + ", name=" + name + ", gender=" + gender + ", Reference=" + Reference
				+ "]";
	}

}
