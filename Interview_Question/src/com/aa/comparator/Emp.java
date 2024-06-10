package com.aa.comparator;

public class Emp{
	
	 int id;
	 String name;
	private int phone;
	
	
	public Emp(int id, String name, int phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}


	
	
	

}
