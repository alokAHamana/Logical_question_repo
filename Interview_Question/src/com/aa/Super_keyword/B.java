package com.aa.Super_keyword;

public class B extends A {

		int a=20;
		void show() {
			System.out.println(a);
			System.out.println(super.a);  // super call the variable of parent class
			
		}
		
		public static void main(String[] args) {
			B r =new B();
			
			r.show();
		}
}
