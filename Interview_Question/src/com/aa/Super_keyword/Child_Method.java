package com.aa.Super_keyword;

public class Child_Method extends Parent_Method{
	
	void show() {
		
		super.show();             // this will print Parent class Method
		System.out.println("Hello Learner");
	}

	public static void main(String[] args) {
		
		Child_Method r = new Child_Method();
		
		r.show();   //out: Hello Learner  ; ye apne hi method ko call kr raha h na ki parent ke 
	}
}  // output after super:
    //Hello viewer
    //Hello Learner
