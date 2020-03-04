package com.wh.trees;

import java.util.Comparator;

public class Node<T extends Number & Comparable<? super T>> {
	
	public T value;
	Node<T> parentNode;
	public Node<T> leftNode;
	public Node<T> rightNode;
	
	
	public Node(T value, Node<T> parent, Node<T> leftNode, Node<T> rightNode) {
		super();
		this.value = value;
		this.parentNode = parent;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public Node(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}



	public void setValue(T value) {
		this.value = value;
	}



	public Node<T> getParentNode() {
		return parentNode;
	}



	public void setParentNode(Node<T> parentNode) {
		this.parentNode = parentNode;
	}



	public Node<T> getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}



	public Node<T> getRightNode() {
		return rightNode;
	}



	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}



	


	



	




	
	
	
	
}
