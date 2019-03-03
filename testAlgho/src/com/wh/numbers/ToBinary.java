package com.wh.numbers;

import java.util.ArrayList;

public class ToBinary {

	/*
	 *  input : number <= 15
 
	 *  		 
	 *  12 = 2^x + 2^x-1 + 2^x-2...2^0
	 *  
	 *  12 = 0b1100 = 2^3 + 2^2
	 *  
	 *  [ 8 , 4 , 2 , 1 ]
	 *  
	 *  
	 *  12 / 2 = 6 ; resto = 0
	 *  6  / 2 = 3 ; resto = 0
	 *  3  / 2 = 1 ; resto = 1
	 *  1  / 2 = 0 ; resto = 1
	 *  
	 *  13 / 2 = 6 ; resto = 1
	 *  6  / 2 = 3 ; resto = 0
	 *  3  / 2 = 1 ; resto = 1
	 *  1  / 2 = 0 ; resto = 1
	 *  
	 *  

	 *  
	 */
	
	public static String transform(int number) {

		int resto , division;
		ArrayList<Integer> binary = new ArrayList<>();
		int i=0;
		
		do {
			division = number / 2; // asig  costo1*1
			resto = number  % 2;   // asig  costo2*1
			binary.add(resto);	   // asig  costo3*1
			number = division;	   // asig  costo4*1
			i++;
			
			
		}while( division >=  1);	   // cycle costo5 * el exponente de una potencia de 2 => 2^x + c = n + c / se quitan constantes
		// => 2^x = n
		// => log en base 2 de n = x
		// => lg n = x
		// Estoy pasando lg(n) + 1 veces por el ciclo para calcular los bits
		//10  -> 5, 2, 1 				  = 2^3 = pasa 3 veces
		//16  ->  8, 4, 2 ,1
		//20  -> 10, 5, 2 ,1 			  = 2^4 = pasa 4 veces 
		//30  -> 15, 7, 3, 1 			  = 2^4 = pasa 4 veces
		//40  -> 20, 10, 5, 2, 1 		  = 2^5 = pasa 5 veces
		//50  -> 25, 12, 6, 3, 1 		  = 2^5 = pasa 5 veces
		//100 -> 50, 25, 12, 6, 3, 1 	  = 2^6 = pasa 6 veces
				
		return (new StringBuilder(binary.toString()).reverse().toString().replaceAll("\\[|\\]|,| ", "") ) + " pase i veces:"+i;
		
	
	}

	public static void main(String[] args) {
		
		System.out.println(ToBinary.transform(8));
		
	}
}
