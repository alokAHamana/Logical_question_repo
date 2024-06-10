package com.aa.This_keyword;

public class A {

	void show() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		A r= new A();
		
		System.out.println(r);
	
		r.show();
	}
}
// same output : prove- this keyword same object ko refere kr raha h jo r kr raha h, jo ki class ka curent object hai
//com.aa.This_keyword.A@2626b418
//com.aa.This_keyword.A@2626b418
