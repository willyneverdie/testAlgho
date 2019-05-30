package com.wh.trees;

public class Trees {
	Node root;	
	
	public Trees(Node root) {
		super();
		this.root = root;
	}



	public Node AddNode(Node root, Node newNode) {
		
		//check first to the left and then to the right
		
		if(root.getLeftNode().isEmpty) {
			root.setLeftNode(newNode);
			return newNode;
		}
		else {
			if(root.rightNode.isEmpty) {
				root.setRightNode(newNode);
				return newNode;
			}
				
		}
		
		AddNode(root.getLeftNode(), newNode);
		AddNode(root.getRightNode(), newNode);
		
	}
	
}
