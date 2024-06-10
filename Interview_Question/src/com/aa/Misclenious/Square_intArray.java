package com.aa.Misclenious;

import java.util.Arrays;

public class Square_intArray {
	
	public static void main(String[] args) {
	    
		int[] numbers = {1, 2, 3, 4, 5};
	    
	    System.out.println(Arrays.toString(numbers));
	    
	    for (int number : numbers) {
	        System.out.print(number * number + ", ");
	    }
	}

}
