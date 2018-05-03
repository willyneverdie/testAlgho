package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.wh.utilities.Utilities;




/**
 * @author williams
 * n is the size of the list
 * O(n^2); you go through the array twice, the original and the sorted
 *
 */
public class SelectionSort {

	final static int _CONSTLARGE = 1000000;
	//int[] sortArray = new int[large];
	private ArrayList<Integer> sortArrayList;
	private ArrayList<Integer> middleArrayList;
	
	public SelectionSort(ArrayList<Integer> ranArray, int large){
		
		middleArrayList = new ArrayList<>();
		sortArrayList = new ArrayList<>();
		sortArrayList.add(ranArray.get(0));
		int min, pos=0;
		
		System.out.println("");
		System.out.print(" Inicio SelectionSort:" + LocalDate.now() + " " + LocalTime.now());
		
		for(int i=0; i < ranArray.size(); i++ )
		{
			min = ranArray.get(i);
			for(int j=i+1; j < ranArray.size(); j++ )
			{
				if(ranArray.get(j) < min)
				{
					min = ranArray.get(j);
					pos = j;
				}
			}
			
			ranArray.set(pos, ranArray.get(i));
			ranArray.set(i,min); 
			
		}
		//Utilities.ShowArrayList(sortArrayList);
		System.out.println("");
		System.out.println(" Fin SelectionSort:" + LocalDate.now() + " " + LocalTime.now());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new SelectionSort(Utilities.RandomArrayList(_CONSTLARGE),_CONSTLARGE);
	}
	
	
}
