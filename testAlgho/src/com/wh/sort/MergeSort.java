package com.wh.sort;

import java.util.Arrays;

import com.wh.utilities.Utilities;

public class MergeSort {

	private static int _CONSTLARGE = 100;
	final static String _ALGO_NAME = "SelectionSort";
	private int[] randomArray;
	private int[] sortArray;
	
	//Constructor
	MergeSort(int[] randomArray){
		
		this.randomArray = randomArray;
	}
	
	public void run() {

		mergeSortImpl(randomArray, 0, randomArray.length - 1 );
		
	}
	
	// method to implement recursion
	public void mergeSortImpl(int[] array, int first, int last) {
		
		try {

			if(first >= last)
			{
				return;
			}
			else {
				
				int middle = ((last + first ) ) / 2 ;
				
				mergeSortImpl(array, first,  middle);
				mergeSortImpl(array, middle + 1 , last);
				
				mergeArray(array , first, middle, last);
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
			
	}
	
	public void mergeArray(
			int[] array, 
			int first, 
			int index, 
			int last
			) 
	{
		
		try {
			
		System.out.println("fist:"+first+"middel:"+index+"last:"+last);
		
		int firstLenght = (((index - first ) + 1));
		int secondLenght = (((last - (index + 1) ) + 1));
		
		int[] firstHalf = new int[firstLenght]; 
		int[] secondHalf = new int[secondLenght];
		
		// large of the new array
		firstHalf = copyArray(array ,first , index);
		secondHalf = copyArray(array ,index + 1  , last);
		
		int lenght = firstLenght + secondLenght;
		
		//new array
		int[] sortedArray = new int[lenght];
		
		int i = 0, j = 0 ,k = 0;
		
		System.out.println("firstHalf:"+Arrays.toString(firstHalf)); //3 2
		System.out.println("secondHalf:"+Arrays.toString(secondHalf));// 6 6 6
		
		int position  = first;

		while(k < lenght) 
		{
			// if both arrays have elements
			if( i < firstLenght && j < secondLenght)
			{
				//sorting
				if(firstHalf[i] < secondHalf[j])
				{
					sortedArray[k] = firstHalf[i];
					array[position] = firstHalf[i];
					position++;
					i++;
				}
				else {
					sortedArray[k] = secondHalf[j];
					array[position] = secondHalf[j];
					position++;
					j++;
				}
			}
			
			else {
				//if one of them has values 
				if(i == firstLenght && j<secondLenght)
				{
					System.out.println("i:"+i+" j:"+j+" k:"+k);
					
					sortedArray[k] = secondHalf[j];
					array[position] = secondHalf[j];
					position++;

					
					j++;
				}
				
				// if one of them has values
				else if(i < firstLenght && j == secondLenght)
				{
					sortedArray[k] = firstHalf[i];
					array[position] = firstHalf[i];
					position++;

					i++;				
				}
			}
			System.out.println("position:"+position);
			System.out.println("arrayOriginal:"+Arrays.toString(sortedArray));
			k++;
		}
		System.out.println("sortedArray:"+Arrays.toString(array));
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	
	
	// return a copy of the array from start to end - 1
	public int[] copyArray(int[] array, int start, int end) {
		
		System.out.println("start:"+start+" end:"+end);
		System.out.println("array:"+Arrays.toString(array));
		
		int size = (end - start) + 1;
			
		int[] arrayTemp = new int[size];
		
		for(int i = 0; i < size; i++) {
			arrayTemp[i] = array[start];
			start++;
		}
			
		System.out.println("arrayTemp:"+Arrays.toString(arrayTemp));
		return arrayTemp;
	}
	
	public static void main(String[] args) {

		MergeSort ms = new MergeSort(Utilities.RandomArray(_CONSTLARGE));
		ms.run();
	}

}
