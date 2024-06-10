package com.aa.This_keyword;

public class B {

	int a;
	
	B(int a){
		this.a=a;   // this call instance variable 
	}
	void show() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		B r= new B(100);
		r.show();
	}
}