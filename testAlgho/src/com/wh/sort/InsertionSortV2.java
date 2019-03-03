package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import com.wh.utilities.Utilities;

public class InsertionSortV2 {

	private static int _CONSTLARGE = 600000;
	final static String _ALGO_NAME = "InsertionSort";
	private int[] randomArray;
	private int[] sortArray;
	
	public InsertionSortV2(int[] randomArray) {
		super();
		this.randomArray = randomArray;
	}
	
	public void run() {
		System.out.println("");
		System.out.print(" Inicio " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		QuickInsertionSortV2(randomArray);
		System.out.println("");
		System.out.println(" Fin    " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		//System.out.println(this.randomArray.toString());
	}
	
	public void QuickInsertionSortV2(int[] randomArray)
	{
		
		for(int i=1; i < randomArray.length ; i++) {
			int value = randomArray[i];
			
			int j = i-1;
			while( j >= 0 ) {
				
				if( value <= randomArray[j]) {
					randomArray[j+1] = randomArray[j];
					randomArray[j] = value;
				}
				
				j--;
			}
		}
		
	}

	public void swap(int[] array, int i, int j){
		int inter = array[j];
		
		array[j] = array[i];
		array[i] = inter;
	}
	
	
	
	@Override
	public String toString() {
		return "InsertionSortV2 [randomArray=" + Arrays.toString(randomArray) + "]";
	}

	public static void main(String[] args) {
	
		InsertionSortV2 insertionSort = new InsertionSortV2(Utilities.RandomArray(_CONSTLARGE));
		//System.out.println(insertionSort.toString());
		insertionSort.run();
		//System.out.println(insertionSort.toString());
	}
	
	
}
