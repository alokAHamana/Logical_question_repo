package com.aa.Sorting_List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort_Student {

	public static void main(String[] args) {

		List<Student> emps = new LinkedList<>();

		emps.add(new Student(3, "alok", 546655));
		emps.add(new Student(1, "amit", 5646444));
		emps.add(new Student(4, "ana", 45445646));
		emps.add(new Student(2, "ram", 56445566));
	
	System.out.println("original:     "+emps);
	
	Collections.sort(emps);
	
	System.out.println("After sorting: "+emps);
	
	
	
	}

}
