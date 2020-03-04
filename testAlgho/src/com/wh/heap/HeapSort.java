package com.wh.heap;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import com.wh.utilities.Utilities;

public class HeapSort {

	private static int _CONSTLARGE = 1000000;
	final static String _ALGO_NAME = "HeapSort";
	MaxHeapListImpl heap;
	private int[] sortedArray = new int[_CONSTLARGE];
	
	public HeapSort(List<Integer> randomArray) {
		super();
		this.heap = new MaxHeapListImpl(randomArray);
	}

	public void run() {
		System.out.println("");
		System.out.println(" Inicio " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		//System.out.println(Arrays.toString(this.heap.getHeap().toArray()));
		HeapSortImpl();
		//System.out.println(Arrays.toString(this.sortedArray));
		System.out.println(" Fin    " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		
	}

	public void HeapSortImpl() {

		heap.BuildMaxHeap();		
		int i = heap.getHeap().size();
		while(i>0) {
			
			sortedArray[i-1] = heap.extractmax();
			i--;
		}
	}
	
	public static void main(String[] args) {
		HeapSort hp = new HeapSort(Utilities.RandomUniqueArrayList(_CONSTLARGE));
		hp.run();
	}

}
