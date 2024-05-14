package com.asg.arrays;

import java.util.HashSet;

public class FindDuplicates {

  public static void main(String[] args) {
    // Initialize the array
    int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

    System.out.println("Duplicate elements in the array: ");

    // Use a HashSet to store unique elements seen so far
    HashSet<Integer> seens = new HashSet<>();

    // Iterate through the array
    for (int element : arr) {
      // If element is already in the HashSet, it's a duplicate
      if (!seens.add(element)) {
        System.out.print(element + " ");
      }
    }
  }
}