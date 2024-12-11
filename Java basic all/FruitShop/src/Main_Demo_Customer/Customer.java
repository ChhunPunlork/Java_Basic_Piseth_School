package Main_Demo_Customer;

public class Customer {
	private String name;
	private String contatInfo;

	public Customer(String name, String contatInfo) {
		super();
		this.name = name;
		this.contatInfo = contatInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContatInfo() {
		return contatInfo;
	}

	public void setContatInfo(String contatInfo) {
		this.contatInfo = contatInfo;
	}

}
