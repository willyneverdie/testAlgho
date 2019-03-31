package com.wh.strings;

public class ReplaceLettersWithRegex {

	public String replace(String str) {
		return str.replaceAll("[a-z||A-Z||\n]", "");
	}
	
	public static void main(String[] args) {
		ReplaceLettersWithRegex rp = new ReplaceLettersWithRegex();
		System.out.println(rp.replace("Hola como estas123, Bien y tu?"));
		
	}

}
