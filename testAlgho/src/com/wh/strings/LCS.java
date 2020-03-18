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
 */
public class LCS {

	private String s1, s2;

	public LCS(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
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
			C[i] = String.valueOf(ds);
			i++;
		
		}
		
		return C; 
	}

	public static void main(String[] args) {

		// String s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
		// String s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
		String s1 = "ACCGGTCGAGTGCGCGG";
		String s2 = "GTCGTTCGGAATGCCGT";
		LCS lcs = new LCS(s1, s2);
		String D[] = lcs.findAllCS();
		
		for (String string : D) {
			if(string != null || string != "")
				System.out.println(string);
		}
			

	}

}
