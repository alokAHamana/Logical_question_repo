package com.aa.Super_keyword;

public class Child_Constructor extends Parent_Constructor{

	Child_Constructor(){
		
    // By default, compiler khud hi super lga deta h for default constructor
    // is liye yaaha paren ka constructor bhi call ho jayenga, becos ye zero parameter constructor hai,, agar paremter constructor hota to hme khud supper keyword laga pdta with paramter
		System.out.println("Hello Child constructor");
	}


	public static void main(String[] args) {
		
		Child_Constructor r = new Child_Constructor();
	}
}
// output: Hello Parent constructor
       //: Hello Child constructor