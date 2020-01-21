package com.wh.heap;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class HeapSort {

	private static int _CONSTLARGE = 50;
	final static String _ALGO_NAME = "HeapSort";
	private int[] randomArray;
	private int[] sortArray;
	
	
	
	public HeapSort(int[] randomArray) {
		super();
		this.randomArray = randomArray;
	}

	public void run() {
		System.out.println("");
		System.out.println(" Inicio " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		System.out.println(Arrays.toString(this.randomArray));
		HeapSortImpl(randomArray);
		System.out.println(Arrays.toString(this.randomArray));
		System.out.println(" Fin    " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		
	}

	public void HeapSortImpl(int[] array) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
