package com.wh.heap;

import com.wh.utilities.Utilities;

public class MinHeapImpl implements MinHeapI{

	int[] heap;
	
	public MinHeapImpl(int[] heap) {
		super();
		this.heap = heap;
	}
	
	public int[] getHeap() {
		return heap;
	}


	public void setHeap(int[] heap) {
		this.heap = heap;
	}

	/**
	 * O(n): O(log n) =  the longest path it can take is the height of the tree
	 */
	
	@Override
	public void Min_Heapify(int pos) {
	
		if(IsLeaf(pos)) return;
		
		int value = heap[pos];
		int left =  LeftChildPos(pos); // return left child position
		int right = RightChildPos(pos);// return right child position
		int lowestPos = 0; // store position with the largest value
		
		//System.out.println(left + "" + right+"");
		if(heap[left] > heap[right])
			lowestPos = right;
		if (heap[right] > heap[left])
			lowestPos = left;
		
		if(heap[lowestPos] < value) {
				swap(heap, pos, lowestPos);
				Min_Heapify(lowestPos);
		}
	}

	/**
	 * O(n) = O(n log n), since you call BuildMaxHeap n/2 times.
	 */
	@Override
	public int[] BuildMinHeap() {
		
		for (int i = heap.length/2-1; i>0 ; i--) {
			Min_Heapify(i);
		}
		return heap;
	}	
	
	private boolean IsLeaf(int pos) {
			
		// 11/2 = 5, position 5
		
		if(pos >= ((heap.length - 1)/2) + 1)
				return true;
			else
				return false;
	}

	private int RightChildPos(int pos) {
		return 2 * pos +1;
	}

	private int LeftChildPos(int pos) {
		return 2 * pos;
	}

	
		
    
    private static void swap(int[] Heap, int fpos, int spos) 
    { 
        int tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
    
	
	
	public static void main(String[] args) {
		
		
		MinHeapImpl Heap = new MinHeapImpl(Utilities.RandomUniqueArray(16));
		//int[] arr = Utilities.RandomArray(16);
		
		for(int i=1;i<Heap.getHeap().length;i++)
			System.out.print(Heap.getHeap()[i]);
		System.out.println();
		printArrayAsTree(Heap.getHeap(), 1, 0);
		
		System.out.println();
		
		int[] arr2 = Heap.BuildMinHeap();
		for (int i = 1; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		printArrayAsTree(arr2, 1, 0);
		
		
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








}
