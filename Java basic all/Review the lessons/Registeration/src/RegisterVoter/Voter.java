package RegisterVoter;

public class Voter {
	private long id;
	private Person person;
	private String location;
	private String code;
	
	

	@Override
	public String toString() {
		return "Voter [id=" + id + ", person=" + person + ", location=" + location + ", code=" + code + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
