package com.wh.trees;

public class Tree {
	Node<Integer> root;	
	static final int COUNT = 10;  
	
	public Tree(Node root) {
		super();
		this.root = root;
	}


	public Node AddNode(Node root, Node newNode, boolean b) {
		
		//check first to the left and then to the right
		
		if(root.getLeftNode() == null) {
			root.setLeftNode(newNode);
			return newNode;
		}
		else if(root.rightNode == null){
			
				root.setRightNode(newNode);
				return newNode;
				
		}else {
			
			if(b)
				AddNode(root.getLeftNode(), newNode,false);
			else
				AddNode(root.getRightNode(), newNode,true);
			
			
		}
		
		
		return newNode;
	}
	
	
	static void print2DUtil(Node root, int space)  
	{  
	    // Base case  
	    if (root == null)  
	        return;  
	  
	    // Increase distance between levels  
	    space += COUNT;  
	  
	    // Process right child first  
	    print2DUtil(root.rightNode, space);  
	  
	    // Print current node after space  
	    // count  
	    System.out.print("\n");  
	    for (int i = COUNT; i < space; i++)  
	        System.out.print(" ");  
	    System.out.print(root.value + "\n");  
	  
	    // Process left child  
	    print2DUtil(root.leftNode, space);  
	}  
	  
	// Wrapper over print2DUtil()  
	static void print2D(Node root)  
	{  
	    // Pass initial space count as 0  
	    print2DUtil(root, 0);  
	}  
	
	


	public static void main(String[] args) {
		
		
		Tree t = new Tree(new Node('a',null,null,null));
		t.AddNode(t.root, new Node('b',null,null,null),true);
		t.AddNode(t.root, new Node('b',null,null,null),true);
		t.AddNode(t.root, new Node('b',null,null,null),true);
		t.AddNode(t.root, new Node('b',null,null,null),true);
		
		print2D(t.root);
		
	}
	
	
}
