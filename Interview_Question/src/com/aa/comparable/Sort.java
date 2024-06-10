package com.aa.comparable;

import java.util.Collections;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {

		//we have to use comprable in treeset or treemap 
		
		TreeSet<Emp> emps = new TreeSet<>();

		emps.add(new Emp(15, "alok", 546655));
		emps.add(new Emp(12, "bmit", 5646444));
		emps.add(new Emp(10, "cana", 45445646));
		emps.add(new Emp(13, "ram", 56445566));
	
	
	System.out.println(emps);

	}
}
