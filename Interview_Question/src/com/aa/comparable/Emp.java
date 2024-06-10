package com.aa.comparable;

public class Emp implements Comparable<Emp>{// used when sorting done on single feild ,or on bases of id
	
	private int id;
	private String name;
	private int phone;
	
	//
	@Override
	public int compareTo(Emp o) {
		return this.id - o.id;
	}
	
	
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
