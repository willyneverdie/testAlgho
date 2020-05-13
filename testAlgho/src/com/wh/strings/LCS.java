package com.wh.strings;

import java.util.Arrays;

/**
 * Longest common subsequence
 * 
 * @author williams For example, if X = (A;B;C;B;D;A;B) and Y = (B;D;C;A;B;A),
 *         the sequence (B;C;A) is a common subsequence of both X and Y. The
 *         sequence (B;C;A) is not a longest common subsequence (LCS) of X and Y
 *         , however, since it has length 3 and the sequence (B;C;B;A), which is
 *         also common to both X and Y , has length 4. The sequence (B;C;B;A) is
 *         an LCS of X and Y, as is the sequence (B;D;A;B), since X and Y have
 *         no common subsequence of length 5 or greater.
 *        
 */
public class LCS {

	private String s1, s2;

	public LCS(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}


	
	public int findLCS() {
		return findLCS(this.s1, this.s2, 0, 0);
	}
	
	/*
	 * To find all commons subsequences we perform 3 while cycles getting a O(n^3)
	 * For each position in the first array, you loop through until the end of the second array
	 * Every time you find a match, you include the character in the result char[] and advance both
	 * indexes one position  
	 */
	public char[][] findAllCS(String s1, String s2) {

		int i = 0, j = 0, k = 0, l = 0, m=0;
		char A[][] = new char[100][100];

		while(m < s1.length()) {
			i=m;
			j=0;
			l=0;
			
			while (i < s1.length()) {

				if (j == s2.length()) {
					j--;
					i++;
				}

				if (i >= s1.length())
					break;

				while (j < s2.length()) {

					if (s1.charAt(i) == s2.charAt(j)) {
						A[k][l] = s1.charAt(i);
						i++;
						j++;
						l++;
						break;
					}

					if (j == s2.length()) {
						j--;
						i++;
					} else
						j++;
				}
			}
			k++;
			m++;
		}
		
		return A;

	}

	public String[] findAllCS() {

		String C[] = new String[100];
		char B[][] = findAllCS(this.s1, this.s2);
		int i = 0;
		
		for (char[] ds : B) {
			System.out.println(ds);
			C[i] = String.valueOf(ds);
			i++;
		
		}
		
		return C; 
	}

	
	/****
	 * Find longest common subsequence.
	 * This algorithm is 'in place' because use the input and return an int value.
	 * Recursion Approach
	 * 
	 * Best Case Scenario: O(n); both arrays are the same. n calls!
	 * Worse Case Scenario: O(2^N); there is not common subsequence and n+m=N
	 * 
	 ****/
	public int findLCS(String s1, String s2, int i, int j) {
		
		if(i >= s1.length() || j >= s2.length())
			return 0;
		
		if(s1.charAt(i) ==  s2.charAt(j))
			return 1 + findLCS(s1, s2, i+1, j+1);
		else
			return Math.max(findLCS(s1, s2, i+1, j), findLCS(s1, s2, i, j+1)) ;
		
	}
	
	/*
	 * @conditions: s1 is the shortest array 
	 */
	
	public int[][] DynamicFindLCS(String s1, String s2) {
		
		int table[][] = new int[s1.length() + 1 ][s2.length() + 1];
		
		//first row and column filled with 0s
		/*for (int i = 0; i < table.length; i++) {
			table[i][0] = 0;
		}
		
		for (int j = 0; j < table.length; j++) {
			table[0][j] = 0;
		}
		*/
		
		for (int i = 1; i < s1.length() + 1; i++) {
			for (int j = 1; j < s2.length() + 1; j++) {
				
				if (s1.charAt(i-1) == s2.charAt(j-1))
					table[i][j] = table[i-1][j-1] + table[i][j] +  1; // sum 1 + diagonal value + actual value
				else
					table[i][j] = Math.max(table[i][j-1] , table[i-1][j] );
			}
		}
		
		return table;
		
		
	}
	
	public static void main(String[] args) {

		// String s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
		// String s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
		//String s1 = "ACCGGTCGAGTGCGCGG";
		//String s2 = "GTCGTTCGGAATGCCGT";
		//String s1 = "ACCGGTXQWL";
		//String s2 = "GTCGTQL";
		
		String s1 = "ABCD";
		String s2 = "BXXD";
		
		LCS lcs = new LCS(s1, s2);
		//String D[] = lcs.findAllCS();
		
		/*for (String string : D) {
			//if(string != null || string != "")
				System.out.println(string);
		}*/
		
		int c[][] = lcs.DynamicFindLCS(s1, s2);
		
		
		for (int i = 0; i < s1.length()+1; i++) {
			for (int j = 0; j < s2.length()+1; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("The longest common subsecuence is:"+lcs.findLCS());

	}

}
