package com.wh.utilities;

import java.util.ArrayList;

public class Utilities {

	private static ArrayList<Integer> randomArrayList;
	
	
	public static int[] RandomArray(int num)
	{
		int[] randomarray = new int[num];
		
		for(int i = 0; i< num; i++)
		{
			randomarray[i] = (int) Math.random();
		}
		
		return randomarray;
	}
	
	public static ArrayList<Integer> RandomArrayList(int num)
	{
		randomArrayList = new ArrayList<>();
		
		for(int i=0; i < num;i++)
		{
			randomArrayList.add((int)(Math.random()*10));
			//System.out.print(" "+randomArrayList.get(i)+" ");
		}
				
		return randomArrayList;
	}
	
	public static void ShowArrayList(ArrayList<Integer> intArrayList){
		System.out.println("");
		for(int values : intArrayList){
			
			System.out.print(" "+ values + " ");
		}
			
		
	}
	
}
