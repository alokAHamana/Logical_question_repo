package com.aa.This_keyword;

public class DeaultConstructor {
	
	DeaultConstructor(){
		System.out.println("Deafault cons");
	}
	
	DeaultConstructor(int a){
		this();            // here this is used to call same class deafault counstructor
		System.out.println(a);
		
		}

	
	public static void main(String[] args) {
		
		DeaultConstructor r= new DeaultConstructor(100);
	
	}
}
