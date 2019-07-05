package com.wh.trees;

import static com.wh.utilities.Utilities.print2D;

public class BinaryTree {

	public Node<Integer> root;
	
	public BinaryTree(Node<Integer> root) {
		super();
		this.root = root;
	}

	public boolean search(Node<Integer> root, Node<Integer> node) {
		if(root != null) {
			System.out.println(root.value + " " + node.value);
			if(root.value == node.value) {
				return true;
			}
				
			else if(root.leftNode!= null && node.value < root.value) {
				return search(root.leftNode, node);
				
			}
			else
				return search(root.rightNode, node);
			
		}
		return false;

		
		
	}
	
	
	public void insert(Node<Integer> root, Node<Integer> node) {
		if(root != null) {
			if(node.value < root.value) {
				if(root.leftNode != null)
					insert(root.leftNode, node);
				else
					root.leftNode = node;
			}else
				if(root.rightNode != null)
					insert(root.rightNode,node);
				else
					root.rightNode = node;
		}
	}
	
	
	
	
	public Node<Integer> getRoot() {
		return root;
	}


	public void setRoot(Node<Integer> root) {
		this.root = root;
	}


	public static void main(String[] args) {
			
		BinaryTree bt = new BinaryTree(new Node<Integer>(5, null, null, null));
		
		bt.insert(bt.getRoot(), new Node<Integer>(1, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(7, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(9, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(2, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(11, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(3, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(4, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(6, null, null, null));
		bt.insert(bt.getRoot(), new Node<Integer>(8, null, null, null));
		
		print2D(bt.root);
		System.out.println(bt.search(bt.root, new Node<Integer>(4, null, null, null)));
		
	}


	
	
}
