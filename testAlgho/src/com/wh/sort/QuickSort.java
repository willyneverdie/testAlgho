package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import com.wh.utilities.Utilities;

public class QuickSort {

	private static int _CONSTLARGE = 20;
	final static String _ALGO_NAME = "QuickSort";
	private int[] randomArray;
	private int[] sortArray;
	
	//Empty constructor
	QuickSort(){
		
	}
	
	//Constructor
	QuickSort(int[] randomArray){
		
		this.randomArray = randomArray;
	}
	
	public void run() {
		System.out.println("");
		System.out.print(" Inicio QuickSort:" + LocalDate.now() + " " + LocalTime.now());
		QuickSortImpl(randomArray, 0, randomArray.length - 1);
		System.out.println("");
		System.out.println(" Fin    QuickSort:" + LocalDate.now() + " " + LocalTime.now());
	}
	
	// method to implement recursion
	public void QuickSortImpl(int[] array, int firstPosition, int pivotPosition) 
	{
		
		try {
			
	
			if(pivotPosition<= firstPosition) {
				
				return;
			}
				
			
			int q = particion(array, firstPosition, pivotPosition);
			QuickSortImpl( array, firstPosition, q-1);
			QuickSortImpl( array, q+1, pivotPosition);
			
			
			
			
		}
		catch(Exception e)
		{
			
		}
		finally {
			
		}
				
	}
	
	
	

	private int particion(int[] array, int firstPosition, int pivotPosition) {

		int i = firstPosition;
		int j = pivotPosition;
		int q = i;
		int pivot = array[pivotPosition];
		
		while( i < j) {
			
			if( array[i] <= array[j]) {
				
				swap(array, i, q);
				q++;
			}
			
			i++;
		}
		
		swap(array, j, q);
		
		return q;
	}

	private void swap(int[] array, int j, int q) {
		int buffer = array[j];
		array[j] = array[q];
		array[q] = buffer;
	}

	public static void main(String[] args) {

		QuickSort ms = new QuickSort(Utilities.RandomArray(_CONSTLARGE));
		ms.run();
	}

}
