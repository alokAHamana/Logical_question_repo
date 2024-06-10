package com.aa.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {

		ArrayList<Emp> emps = new ArrayList<>();

		emps.add(new Emp(5, "alok", 546655));
		emps.add(new Emp(2, "sumit", 5646444));
		emps.add(new Emp(6, "tina", 45445646));
		emps.add(new Emp(1, "ram", 56445566));
	
	System.out.println("original:"+emps);
	
	Collections.sort(emps,new IdComparator());
	
	System.out.println("compare by Id "+emps);
	
	
	ArrayList<Emp> emps1 = new ArrayList<>(emps);
	
	Collections.sort(emps1, new NameComparator());
	
	System.out.println("compare by name "+emps1);
	
	}

}
