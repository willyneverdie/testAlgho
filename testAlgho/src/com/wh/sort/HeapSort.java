package com.wh.sort;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import com.wh.heap.MaxHeapListImpl;
import com.wh.utilities.Utilities;
/**
 * 
 * @author williams
 * HeapSort implemented with ArrayList. The running time is O(nlogn).
 * Also, this algorithms is 'in-place' because it use the same space to generate the sorted array
 * 
 */

public class HeapSort {

	private static int _CONSTLARGE = 15;
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
		System.out.println(Arrays.toString(this.heap.getHeap().toArray()));
		HeapSortImpl();
		System.out.println(Arrays.toString(this.heap.getHeap().toArray()));
		System.out.println(" Fin    " + _ALGO_NAME + " " + LocalDate.now() + " " + LocalTime.now());
		
	}

	public void HeapSortImpl() {

		heap.BuildMaxHeap();		
		heap.shiftUp();
		
	}
	
	public static void main(String[] args) {
		HeapSort hp = new HeapSort(Utilities.RandomUniqueArrayList(_CONSTLARGE));
		hp.run();
	}

}
