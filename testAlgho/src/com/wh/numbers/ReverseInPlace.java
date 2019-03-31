package com.wh.numbers;

import com.wh.utilities.Utilities;

/**
 * 
 * @author williams
 * 
 * We reverse a char array using and in-place algorithm.
 * In-place means that we don't use another data structures to solve the reverse problem.
 * This algorithm takes O(n/2) time because we loop through half the array. Linear grow.
 * We are not considering the creation of the array 
 */

public class ReverseInPlace {
	
	char[] reverseStr;
	char temp;
	
	public ReverseInPlace(char[] reverseStr) {
		super();
		this.reverseStr = reverseStr;
	}

	public char[] run() {
		
		System.out.println(reverseStr);
		for(int i=0;i < reverseStr.length / 2; i++) {
			temp = reverseStr[i];
			reverseStr[i] = reverseStr[ reverseStr.length - i - 1];
			reverseStr[ reverseStr.length - i - 1] = temp;
		}
		
		return reverseStr;
		
	}
	
	public static void main(String[] args) {
		
		
		Runtime runtime = Runtime.getRuntime();
	    long usedMemoryBefore = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("Used Memory before:" + (long) usedMemoryBefore);		
		
		ReverseInPlace rip = new ReverseInPlace(Utilities.CharRandomArray(13));
		System.out.println(rip.run());
		//rip.run();
		
		long usedMemoryAfter = runtime.totalMemory() - runtime.freeMemory();
	    System.out.println("Memory increased:" + (usedMemoryAfter-usedMemoryBefore));
		//char a = 90;
		//char b = 65;
		//System.out.println(a);
		//System.out.println(b);
	}
	
}
