package com.wh.heap;

import java.util.List;

import com.wh.utilities.Utilities;

public class MaxHeapListImpl implements MaxHeapI{

	List<Integer> heap;
	
	public MaxHeapListImpl(List<Integer> heap) {
		super();
		this.heap = heap;
	}

	public List<Integer> getHeap() {
		return heap;
	}

	public void setHeap(List<Integer> heap) {
		this.heap = heap;
	}

	/**
	 * O(n): O(log n) =  the longest path it can take is the height of the tree
	 */
	
	@Override
	public void Max_Heapify(int pos) {
	
		if(IsLeaf(pos)) return;
		
		int value = heap.get(pos);
		int left =  LeftChildPos(pos); // return left child position
		int right = RightChildPos(pos);// return right child position
		int largestPos = 0; // store position with the largest value
		
		//System.out.println(left + "" + right+"");
		if(heap.get(left) > heap.get(right))
			largestPos = left;
		if (heap.get(right) > heap.get(left))
			largestPos = right;
		
		if(heap.get(largestPos) > value) {
				swap(heap, pos, largestPos);
				Max_Heapify(largestPos);
		}
	}

	/**
	 * O(n) = O(n log n), since you call BuildMaxHeap n/2 times.
	 */
	@Override
	public List<Integer> BuildMaxHeap() {
		//System.out.println("size:"+heap.size()/2);
		for (int i = (heap.size()/2)-1; i>=0 ; i--) { //if starting from 0, use heap.size()/2)-1 
			Max_Heapify(i);
		}
		return heap;
	}	
	
	private boolean IsLeaf(int pos) {
			
		// 11/2 = 5, position 5
		
		if(pos >= ((heap.size() - 1)/2) ) //add +1 if starting from position 1 
				return true;
			else
				return false;
	}

//	private int RightChildPos(int pos) {
//		return 2 * pos +1;
//	}
//
//	private int LeftChildPos(int pos) {
//		return 2 * pos;
//	}

	/*
	 * If we assume zero-based array, then the Equation are the following:
	 * private int RightChildPos(int pos) { return 2 * pos + 2; }
	 * 
	 * private int LeftChildPos(int pos) { return 2 * pos + 1; }
	 */	
	private int RightChildPos(int pos) { return 2 * pos + 2; }
	private int LeftChildPos(int pos) { return 2 * pos + 1; }
	
    private static void swap(List<Integer> Heap, int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap.get(fpos); 
        Heap.set(fpos, Heap.get(spos));//[fpos] = Heap[spos]; 
        Heap.set(spos, tmp);//[spos] = tmp; 
    } 
    
	
    
	
	public static void main(String[] args) {
		
	
		//Create arrayList with size 16
		MaxHeapListImpl Heap = new MaxHeapListImpl(Utilities.RandomUniqueArrayList(15));
		
		//Show initial arrayList
		Utilities.ShowArrayList(Heap.getHeap());
		System.out.println();
		printArrayListAsTree(Heap.getHeap(), 0, 0);
		System.out.println();
		
		//Create Max-Heap
		Heap.BuildMaxHeap();
		Utilities.ShowArrayList(Heap.getHeap());
		System.out.println();
		printArrayListAsTree(Heap.getHeap(), 0, 0);

		//Extract-Max
		System.out.println();
		System.out.println("Max is "+ Heap.extractmax());
		printArrayListAsTree(Heap.getHeap(), 0, 0);
		
		//  parent(i) = i / 2
		//  left (i) = 2i
		//  right(i) = 2i+1
		
		
		
	}
	
	static void  printArrayAsTree(int[] arr, int index, int level) {
		// 2, 5, 7, 3, 1, 9, 8, 0, 4, 6
				//level 0 position 1 ->                      2^0
				//level 1 position 2-3 ->                    2^1
				//level 2 position 4-5-6-7 ->                2^2
				//level 3 position 8-9-10-11-12-13-14-15->   2^3
		//arr , 1 , 1
		//print arr from index to 2^(level)
		//printTree(int[] arr, i, level+1)
		//until? end of array
		int i=0;
		
		if(index < arr.length) {
			
			if(Math.pow(2, level) == 1) {
				System.out.println(arr[index]);
				index=index+1;
				level=level+1;
				printArrayAsTree(arr, index, level);
			}
			else {

				for(i=index; i< index+Math.pow(2, level);i++) {
					if(i<arr.length)
						System.out.print(arr[i] + " ");	
				}
				System.out.println("");
				printArrayAsTree(arr, i, level+1);
			}
		}
	}

	static void  printArrayListAsTree(List<Integer> arr, int index, int level) {

		int i=0;
		if(index < arr.size()) {
			
			if(Math.pow(2, level) == 1) {
				System.out.println(arr.get(index));
				index=index+1;
				level=level+1;
				printArrayListAsTree(arr, index, level);
			}
			else {

				for(i=index; i< index+Math.pow(2, level);i++) {
					if(i<arr.size())
						System.out.print(arr.get(i) + " ");	
				}
				System.out.println("");
				printArrayListAsTree(arr, i, level+1);
			}
		}
	}
	
	@Override
	public boolean insert(int priority) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	
	/*
	 * extractmax() takes in the worse case log(n) time due to Max_Heapify call 
	 * O() = O(log n)
	 */
	@Override
	public int extractmax() {
		
		int max = this.heap.get(0);
		int last = this.heap.get(this.heap.size() - 1);
		this.heap.remove(this.heap.size() - 1);
		this.heap.set(0, last);
		Max_Heapify(0);
		return max;
	}

	@Override
	public int decreaseKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMax() {
		return this.heap.get(0);
	}








}
