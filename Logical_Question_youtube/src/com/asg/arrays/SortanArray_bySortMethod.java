package com.asg.arrays;

import java.util.Arrays;

public class SortanArray_bySortMethod {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,3,1};

	for(int i=0; i<arr.length; i++) {
		for(int j=i+1;j<arr.length; j++ ) {
			
			if(arr[i]>arr[j]) {
				int temp =arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
	
}
}