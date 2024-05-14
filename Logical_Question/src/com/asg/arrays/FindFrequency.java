package com.asg.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {

  public static void main(String[] args) {
    // Initialize the array
    int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};

    // Use a HashMap to store element frequencies
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();

    // Iterate through the array and update frequencies in the HashMap
    for (int element : arr) {
      int count = frequencyMap.getOrDefault(element, 0);
      frequencyMap.put(element, count + 1);
    }

    // Print the frequency of each element
    System.out.println("Element - Frequency");
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
      System.out.println(entry.getKey() + "       - " + entry.getValue());
    }
  }
}