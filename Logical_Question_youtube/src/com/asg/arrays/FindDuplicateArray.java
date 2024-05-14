package com.asg.arrays;

public class FindDuplicateArray {

	public static void main(String[] args) {

		int[] ar = { 4, 2, 3, 2, 1, 4, 5, 3 };

		for (int i = 0; i <ar.length; i++) {

			for (int j = i + 1; i < ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}
	}

}
