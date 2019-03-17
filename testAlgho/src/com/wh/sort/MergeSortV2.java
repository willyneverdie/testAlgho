package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import com.wh.utilities.Utilities;

/**
 * 
 * @author williams
 * We call the recursion log(n) times because we divided by 2 each time
 * n, n/2, n/4, n/8...this form a tree.
 * 
 * Then the merge part loop through the array once per invocation.
 * 
 * O(n * log(n))
 * 
 */

public class MergeSortV2 {

	private static int _CONSTLARGE = 50;
	final static String _ALGO_NAME = "MergeSortV2";
	private int[] randomArray;
	private int[] sortArray;
	
	//Constructor
	MergeSortV2(int[] randomArray){
		
		this.randomArray = randomArray;
	}
	
	public void run() {
		System.out.println("");
		System.out.println(" Inicio " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		System.out.println(Arrays.toString(this.randomArray));
		mergeSortImpl(randomArray);
		System.out.println(Arrays.toString(this.randomArray));
		System.out.println(" Fin    " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		
	}
	
	// method to implement recursion
	public void mergeSortImpl(int[] array) {
		
		
			if( array.length <= 1) {
				//System.out.println("EXIT");
				return;
				
			}
				
			else {
				
				int large = array.length;
				int middle = large / 2;
				
				int[] array1 = Arrays.copyOfRange(array, 0, middle);
				int[] array2 = Arrays.copyOfRange(array, middle, large);
				
				//System.out.println("call mergeSortImpl( array1 ):"+Arrays.toString(array1));
				mergeSortImpl( array1 );
				//System.out.println("call mergeSortImpl( array2 ):"+Arrays.toString(array2));
				mergeSortImpl( array2 );
				//array = mergeArray(array1, array2);
				//System.out.println("call mergeArray(array1, array2, array):"+Arrays.toString(array1)+Arrays.toString(array2)+Arrays.toString(array));
				mergeArray(array1, array2, array);
				//System.out.println(Arrays.toString(array));
			}
		
		
		
			
	}
	
	public void mergeArray(int[] a1, int[] a2, int[] array) {
		
		int i = 0 , j = 0, k = 0;
		
		int max = a1.length >= a2.length ? a1.length : a2.length;  
		int l1 = a1.length;
		int l2 = a2.length; 
		
		int[] merg = new int[l1 + l2];
		
		while( i < l1 && j < l2 ) {
			
			if(a1[i] <= a2[j]) 
				//merg[k++] = a1[i++];	
				array[k++] = a1[i++];
			else
				//merg[k++] = a2[j++];
				array[k++] = a2[j++];
			
		}
		
		while(i < l1)
			//merg[k++] = a1[i++];
			array[k++] = a1[i++];
		
		while(j < l2)
			//merg[k++] = a2[j++];
			array[k++] = a2[j++];
		
		//return merg;
		//return array;
	}
	
	
	
	public static void main(String[] args) {

		MergeSortV2 ms = new MergeSortV2(Utilities.RandomArray(_CONSTLARGE));
		//MergeSortV2 ms = new MergeSortV2(new int[] {91,52,18,23});
		ms.run();
	}

}
