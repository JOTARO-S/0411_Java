package jp.mylibrary;

class User {
	private int id;
	private String name;
	private String phonenumber;
	private String address;
	
	User(int id, String name, String phonenumber, String address) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	User(String name, String phonenumber, String address) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	User() {
		
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

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
