package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.wh.utilities.Utilities;




/**
 * @author williams
 *
 */
public class InsertionSort {

	final static int _CONSTLARGE = 1000000;
	//int[] sortArray = new int[large];
	private ArrayList<Integer> sortArrayList;
	private ArrayList<Integer> middleArrayList;
	
	public InsertionSort(ArrayList<Integer> ranArray, int large){
		
		middleArrayList = new ArrayList<>();
		sortArrayList = new ArrayList<>();
		sortArrayList.add(ranArray.get(0));
		System.out.println("");
		System.out.print(" Inicio InsertionSort:" + LocalDate.now() + " " + LocalTime.now());
		for(int i=1; i < ranArray.size(); i++ )
		{
			int j = 0;
			boolean b = true;
			while( j < sortArrayList.size() && b)
			{
				if(ranArray.get(i) < sortArrayList.get(j))
				{

					sortArrayList.add(j, ranArray.get(i));
					b = false;
				}
				else
				{
					if(j == sortArrayList.size()-1)
					{
						sortArrayList.add(ranArray.get(i));
						b = false;
					}
				}
				j++;
			}
				
		}
		//Utilities.ShowArrayList(sortArrayList);
		System.out.println("");
		System.out.println(" Fin InsertionSort:" + LocalDate.now() + " " + LocalTime.now());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new InsertionSort(Utilities.RandomArrayList(_CONSTLARGE),_CONSTLARGE);
	}
	
	
}
