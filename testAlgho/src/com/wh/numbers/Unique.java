package com.wh.numbers;

import java.util.HashSet;

public class Unique {

	
	
	public static void main(String[] args) {
		
	
	//Array
	int[] arr = {1,1,3,4,5,9,7,8}; 	
	
	if(isUnique1(arr))
		System.out.println("it has Not repeated elements");
	else
		System.out.println("it has repeated elements");
	
	
	}

	private static boolean isUnique(int[] arr) {
		
		boolean b = true;		
		HashSet<Integer> set = new HashSet<>();
		
		for (Integer integer : arr) 
			if(!set.add(integer))
				b = false;
		return b;
	}
	
	private static boolean isUnique1(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if(i!=j)
					if(value==arr[j])
						return false;
			}
		}
		
		
		return true;
		
	}
}
