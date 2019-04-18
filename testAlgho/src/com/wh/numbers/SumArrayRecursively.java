package com.wh.numbers;

import java.util.Arrays;

import com.wh.utilities.Utilities;

public class SumArrayRecursively {

	
	
	public static int sumArrayRecursively(int[] intArray, int arrayIndex){
		
		if(arrayIndex == 0){
			return 0;
		}else
			return intArray[arrayIndex-1] + sumArrayRecursively(intArray, arrayIndex - 1);
			
	}
	
	public static void main(String[] args) {
		int[] ra = Utilities.RandomArray(10);
		System.out.println(Arrays.toString(ra));
		System.out.println(sumArrayRecursively(ra, 10));

	}

}
 