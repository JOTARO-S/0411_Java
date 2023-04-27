package jp.mylibrary;

class User {
	private int id;
	private String name;
	private String phonenumber;
	private String addres;
	
	User(int id, String name, String phonenumber, String addres) {
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.addres = addres;
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

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}
}
