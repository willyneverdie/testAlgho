package com.wh.numbers;

import java.util.Arrays;

import com.wh.utilities.Utilities;

public class MaxElementRecursively {

	public static void main(String[] args) {
		int[] arr = Utilities.RandomArray(10);
		System.out.println(Arrays.toString(arr));
		System.out.println(getMaxValueRecursively(0, 9 ,arr));
		
	}

	// All arr elements are >= 0
	private static int getMaxValue(int[] arr) {
		
		int value = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= value)
				value = arr[i];
		}
		
		return value;
	}
	
	
	private static int getMaxValueRecursively(int max,int length, int[] arr) {
		
		if(length > 0) {
			
			if(arr[length] > max) {
				max = arr[length]; 				
			}
			
			return getMaxValueRecursively(max, length -1, arr);
			
		}else
			return max;
		
		
		
	}
}
