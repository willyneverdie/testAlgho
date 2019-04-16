package com.wh.numbers;



/**
 * 
 * @author williams
 * Factorial number grows fast. integer datatype is not a good fit for this algorithm 
 */

public class Factorial {

	
	public static void main(String[] args) {
				
		System.out.println(Factorial.calculate(20));
		
	}


	private static int calculate(int number) {
		
		if(number == 0)
			return 1;
		else
			return number * calculate(number - 1);
		
	}
	
	
}
