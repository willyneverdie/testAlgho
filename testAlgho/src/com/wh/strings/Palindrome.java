package com.wh.strings;

public class Palindrome {

	String str1;
	String str2;
	
	
	
	public Palindrome(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
	}


	public boolean isPalindrome(){
		
		
		if(str1.length() != str2.length())
			return false;
		
		int large = str2.length() - 1;
		for(int i=0; i < str1.length(); i++){
			
			if(str1.charAt(i) != str2.charAt(large)){
				return false;
			}
			large--;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		Palindrome pal = new Palindrome("ANAANA","ANAANA1");
		System.out.println(pal.isPalindrome());
	}

}
