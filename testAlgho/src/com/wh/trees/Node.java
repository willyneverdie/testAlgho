package com.wh.trees;

public class Node {
	
	char value;
	Node parentNode;
	Node leftNode;
	Node rightNode;
	
	
	public Node(char value, Node parent, Node leftNode, Node rightNode) {
		super();
		this.value = value;
		this.parentNode = parent;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	//Getters
	public char getValue() { return value;}

	public Node getParentNode() {return parentNode;}
	
	public Node getLeftNode() {	return leftNode;}

	public Node getRightNode() {return rightNode;}

	
	//Setter
	public void setValue(char value) {	this.value = value;	}

	public void setParentNode(Node parentNode) {this.parentNode = parentNode;}

	public void setLeftNode(Node leftNode) {this.leftNode = leftNode;}

	public void setRightNode(Node rightNode) {	this.rightNode = rightNode;	}
	

	
	
	
	
}
