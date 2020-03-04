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

	public void inverseHeapify(int pos) {
		
		
		if(pos > 0) {
			int parentIndex = getParentPos(pos);
			if(this.heap.get(parentIndex) <= this.heap.get(pos)) {
				swap(this.heap, parentIndex, pos);
				inverseHeapify(parentIndex);
			}
		}
		
	}
	
	/**
	 * O(n): O(log n) =  the longest path it can take is the height of the tree
	 */
	@Override
	public void Max_Heapify(int pos) {
	
		if(IsLeaf(pos)) return;
		
		if(heap.size()<3) {
			//System.out.println("pos:"+pos);
			//System.out.println("heap size:"+heap.size());
			if(heap.get(pos) < heap.get(LeftChildPos(pos))) {
				swap(heap, pos, LeftChildPos(pos));
			}
			return;
		}
		
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
		if(pos==0) return false;
		
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
	private int getParentPos(int pos) { return (pos-1)/2; }
	
    private static void swap(List<Integer> Heap, int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap.get(fpos); 
        Heap.set(fpos, Heap.get(spos));//[fpos] = Heap[spos]; 
        Heap.set(spos, tmp);//[spos] = tmp; 
    } 
    
	
    
	
	
	
	
		
	@Override
	public boolean insert(int newValue) {
		this.heap.add(newValue);
		inverseHeapify(this.heap.size()-1);	
		return true;
		
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
		if(this.heap.size()>2) {
			
			int last = this.heap.get(this.heap.size() - 1);
			this.heap.remove(this.heap.size() - 1);
			this.heap.set(0, last);
			Max_Heapify(0);
		}else {
			this.heap.remove(0);
		}
		
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


	public static void main(String[] args) {
		
		
		//Create arrayList with 15 elements
		MaxHeapListImpl Heap = new MaxHeapListImpl(Utilities.RandomUniqueArrayList(15));
		
		//Show initial arrayList
		Utilities.ShowArrayList(Heap.getHeap());
		System.out.println();
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);
		System.out.println();
		
		//Create Max-Heap
		Heap.BuildMaxHeap();
		Utilities.ShowArrayList(Heap.getHeap());
		System.out.println();
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);

		//Extract-Max
		System.out.println();
		System.out.println("Max is "+ Heap.extractmax());
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);
		
		//Insert
		System.out.println();
		Heap.insert(34);
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);
		
		Heap.insert(25);
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);
		
		Heap.insert(29);
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);
		
		Heap.insert(31);
		Utilities.printArrayListAsTree(Heap.getHeap(), 0, 0);

		
		
	}





}
