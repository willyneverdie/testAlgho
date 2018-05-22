package com.wh.sort;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.wh.utilities.Utilities;




/**
 * @author williams herrera
 * n is the size of the arrayList
 * O(n^2); you go through the array twice, the original and the sorted one
 *
 */
public class SelectionSort {

	final static int _N = 1000000;
	final static String _ALGO_NAME = "SelectionSort";
	
	
	private ArrayList<Integer> sortArrayList;
	private LocalTime lt;
	
	public SelectionSort(ArrayList<Integer> ranArray, int large, boolean logDebug){
		
		sortArrayList = new ArrayList<>();
		sortArrayList.add(ranArray.get(0));
		int min, pos=0;
		
		if(logDebug) {
			
			System.out.println(Utilities.startLog(_ALGO_NAME, lt = LocalTime.now()));
		}
		
		
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
		
		if(logDebug) {
			Utilities.endsLog(_ALGO_NAME , lt, LocalTime.now());
		}
		
	}
	
	public static void main(String[] args) {
		
		
		new SelectionSort(Utilities.RandomArrayList(_N),_N, true);
	}
	
	
}
