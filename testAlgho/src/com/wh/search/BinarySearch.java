package com.wh.search;

import java.util.Arrays;

import com.wh.utilities.Utilities;

public class BinarySearch {

	
	public static final int ARRAY_LENGTH = 1_000;
	
	public static int binarySearch(int[] data , int target, int low, int high) throws InterruptedException{
		
		int middle = (high + low) / 2;
		
		System.out.println("low:"+low+" high:"+high);
		System.out.println("middle:"+middle);
		System.out.println("data["+middle+"]:"+data[middle]);
		System.out.println("-----------------------");
		
		if( target == data[middle])
			return middle;
		
		
		if (low >= high){
			return -1;
		}
		
		
		//Thread.sleep(2000);
		
		if(target < data[middle] )
			return binarySearch(data , target, low, middle);
		else
			return binarySearch(data , target, middle + 1, high);
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int[] ranArray = Utilities.RandomArray(ARRAY_LENGTH);
		Arrays.sort(ranArray);
		//System.out.println(Arrays.toString(ranArray));
		
		System.out.println(binarySearch(ranArray, 100, 0, ARRAY_LENGTH - 1));

	}

}
