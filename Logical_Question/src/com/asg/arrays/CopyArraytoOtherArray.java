package com.asg.arrays;

public class CopyArraytoOtherArray {
	
		  public static void main(String[] args) {
		    // Initialize the first array
		    int[] arr1 = {1, 2, 3, 4, 5};

		    // Create another array with the same size as the first array
		    int[] arr2 = new int[arr1.length];

		    // Copy elements of arr1 to arr2
		    for (int i = 0; i < arr1.length; i++) {
		      arr2[i] = arr1[i];
		    }

		    // Displaying elements of the original array
		    System.out.println("Elements of original array: ");
		    for (int i = 0; i < arr1.length; i++) {
		      System.out.print(arr1[i] + " ");
		    }
		    System.out.println();

		    // Displaying elements of the copied array
		    System.out.println("Elements of copied array: ");
		    for (int i = 0; i < arr2.length; i++) {
		      System.out.print(arr2[i] + " ");
		    }
		  }
		}