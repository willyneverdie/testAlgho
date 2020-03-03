package com.wh.heap;

import java.util.List;

/**
 * 
 * @author williams
 * @Comment: We can view it as a nearly complete binary tree
 * There are two kinds of binary heaps: max-heaps and min-heaps. They must satisfy a heap property
 * For the Heapsort algorithm, we use max-heaps. Min-heaps commonly implement priority queues
 * You can view a max heap as a binary tree, where each node has two (or fewer) children,
 * and the key of each node (i.e. the number inside the node) is greater than the keys of its child nodes. 
 *  the root of the tree: i = 1
 *  parent(i) = i / 2
 *  left (i) = 2i
 *  right(i) = 2i+1
 *  
 * if i=0
 * parent(i) = (index-1)/2
 * left (i) = index*2+1
 * right(i) = index*2+2
 *
 * 0  --->0, 1, 2
 * | \
 * 1  2   ---> 0, 3, 4 ---> 0, 5, 6
 * |\  |\
 * 3 4 5 6
 */
public interface MaxHeapI {

	/*
	 * max_heapify
	 * @param: int[] arr, int i	
	 */
	public void Max_Heapify(int i);
	
	/*
	 * build max heap
	 * @param: int[] arr
	 */
	public List<Integer> BuildMaxHeap();
	
	public boolean insert(int priority);
	public boolean delete();
	public int extractmax();
	public int getMax();
	public int decreaseKey();
	
}
