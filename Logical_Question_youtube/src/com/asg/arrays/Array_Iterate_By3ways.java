package com.asg.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Array_Iterate_By3ways {
	
	public static void main(String[] args) {
	
	String[] names = {"sachin","alok","ramu"};
	
	System.out.println("---------By using for loop------------");
	for(int i=0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	System.out.println("-----------by for each--------------");
	for(String str: names) {
		System.out.println(str);
	}
	
	System.out.println("-----------by using Stream -----java8------");
	Stream.of(names).forEach(xyz -> System.out.println(xyz));
	
	
	System.out.println("-------------Reverse Array-------------------");
	for(int i=names.length-1 ;i>=0 ;i--) {
		System.out.println(names[i]);
	}
	
	System.out.println("---------------by toString() method-----------");
	System.out.println(Arrays.toString(names));
	}
}