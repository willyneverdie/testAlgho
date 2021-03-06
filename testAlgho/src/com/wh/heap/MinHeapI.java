package com.wh.heap;
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
 */
public interface MinHeapI {

	/*
	 * min_heapify
	 * @param: int[] arr, int i	
	 */
	public void Min_Heapify(int i);
	
	/*
	 * build min heap
	 * @param: int[] arr
	 */
	public int[] BuildMinHeap();
	
	
}

