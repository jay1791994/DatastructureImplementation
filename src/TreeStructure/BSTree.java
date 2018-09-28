package TreeStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import LinkedListImplementation.Node;


public class BSTree extends BinaryTree {

	TreeNode root ;

	
	
	
	public void create(TreeNode node , int x) {
		root = node ;
		root.data = x ;
	}
	
	public void insert(TreeNode node , int x) {
		
		TreeNode node1 = node ;
		
		
		TreeNode p = null , q ;
		
		q = new TreeNode(x) ;
		q.right = null ;
		q.left =  null ;
		
		
		
		if(root == null) {
			create(node , x);
		
		}
		
		
		
	while(node1 != null) {
		p = node1 ;
		if( x > node1.data) {
			node1 =  node1.right ;
		}else {
			node1 = node1.left ;
		}
	 	
	}
	
	if( x > p.data) {
		p.right = q ;
	}else {
		p.left = q ;
	}
		 
	
	}

	public boolean find(TreeNode root, int i) {
		
		if(root == null) {
			return false ;
		}
		if(root.data == i) {
			return true ;
		}
		
		TreeNode node = root ;
		while( node!= null) {
			
			if( i > node.data) {
				return (find(node.right, i));
			}else {
				return(find(node.left , i));
			}
		}
		
		return false ;
	}
	
	TreeNode creatTreeFromArray ( int[] Array, int start, int end) {
		
		TreeNode node ;
		if(start > end) {
		
			return null  ;
		}
		
		int mid = (start + end) / 2 ;
		node = new TreeNode (Array[mid]) ;
		System.out.println(node.data);
		node.left = creatTreeFromArray( Array, start , mid-1) ;
	    node.right =  creatTreeFromArray(Array, mid+1, end) ;
		
       return node ;
		
		}
	
	void ListoflevelLinkedList(TreeNode root) {
	
		TreeNode node =  root ;
		Queue q = new LinkedList<TreeNode>();
		
		q.add(root) ;
		ArrayList<LinkedList<TreeNode>> list =  new ArrayList<LinkedList<TreeNode>>(); 
		
		
		
		
		while(!q.isEmpty()) {
			
			 int size = q.size() ;
			 LinkedList<TreeNode> level0  = new LinkedList<TreeNode>();
			 while(size>0) {
				
				 TreeNode node1 = (TreeNode)q.poll() ;
				 level0.add(node);
				 if(node1.left != null) {
					 q.add(node1.left);
					
				 }
				 if(node1.right != null) {
					 q.add(node1.right) ;
				 }
				 size-- ;
			 }
			 list.add(level0);
			
			
		}
		
		 System.out.println("size of list of linked list"+  list.size());
		
		
	}
	

}
