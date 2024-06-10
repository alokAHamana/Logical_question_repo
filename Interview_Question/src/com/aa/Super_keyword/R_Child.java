package com.aa.Super_keyword;

public class R_Child extends Parent {
	
	R_Child(){
		
		super(101);  // yaha hme super keyword laga pdega kyunki parent ka cunstructor parametrised hai;
		System.out.println("Child cunstructor");
	}

	public static void main(String[] args) {
		
		R_Child r = new R_Child();

	}
}
//Hello Parent constructor
//Child cunstructor

