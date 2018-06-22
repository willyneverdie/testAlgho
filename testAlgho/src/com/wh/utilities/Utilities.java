package com.wh.utilities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class Utilities {

	private static ArrayList<Integer> randomArrayList;
	
	
	public static int[] RandomArray(int num)
	{
		int[] randomarray = new int[num];
		Random ran = new Random();
		
		for(int i = 0; i< num; i++)
		{
			randomarray[i] = ran.nextInt(num);
			//randomarray[i] = (int) Math.random();
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
	
	public static String startLog(String algho, LocalTime start) {
		
		return " Inicio " + algho + ": " + LocalDate.now() + " " + start.toString();
	}
	
	public static String endsLog(String algho, LocalTime start, LocalTime end) {
		
		System.out.println(" Fin    " + algho + ": "+ LocalDate.now() + " " + end);
		Duration duration = Duration.between(start, end);
	    return System.out.printf(" Seconds between %s and %s is: %s seconds.%n",
	                start, end, duration.getSeconds()).toString();
		
	}
}
