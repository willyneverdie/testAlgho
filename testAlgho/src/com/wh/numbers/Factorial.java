package com.wh.numbers;



/**
 * 
 * @author williams
 * Factorial number grows fast. integer datatype is not a good fit for this algorithm 
 */

public class Factorial {

	public static int count;
	
	public static void main(String[] args) {
				
		System.out.println(Factorial.calculate(5));
		
	}


	private static int calculate(int number) {
		System.out.println("Iteration:"+count++);
		if(number == 0)
			return 1;
		else
			return number * calculate(number - 1);
		
	}
	
	
}
