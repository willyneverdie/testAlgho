package com.wh.regexp;

/*
 * Write a function that takes two strings as arguments, s and p, and returns
 * a boolean denoting whether s matches p
 * 
 * p is a secuense of any number of the following:
 * 	1. a-z - which stands for itself
 * 	2. .   - which matches any character
 *  3. *   - which matches 0 or more occurrences of the previous single character
 *  
 *  s = "aba", p = "ab" => false
 *  
 *  s = "aa", p = "a*" => true
 *  
 *  s = "ab", p = ".*" => true
 *  
 *  s = "ab", p = "." => false
 *  
 *  s = "aab", p = "c*a*b" => true
 *  
 *  s = "aaa", p = "a*."=> true?	
 */


public class Match {

	public static boolean MatchPattern(String str, String pattern) {
		
		String[] strArray =  str.split("[a-z]*");
		String[] patternArray =  pattern.split("\\*");
		System.out.println(patternArray[1]);
		System.out.println(strArray[0]);
		//If array lenght = 1 
			//Is a String or
			//Is a String with dot or
			//Is a dot
		//Else
			//For each element el in the patternArray
				//check el ==
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Match.MatchPattern("aaa", "a*b*"));
		
	}
}
