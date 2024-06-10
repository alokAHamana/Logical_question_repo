package com.asg.arrays;
public class PrintArray {

  public static void main(String[] args) {
    // Initialize the array
    int[] arr = {1, 2, 3, 4, 5};

    // Loop through the array and print each element
    System.out.println("Elements of the array: ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  
    // Alternatively, you can use the enhanced for loop (for-each loop)
    System.out.println("\nUsing for-each loop:");
    for (int num : arr) {
        System.out.print(num + " ");
    }
  
  
  }
}