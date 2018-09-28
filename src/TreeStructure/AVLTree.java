package TreeStructure;

public class AVLTree {
	
	TreeNode root ;
	
	public static TreeNode insert( TreeNode root,int val) {
		
		if(root == null) {
			root = new TreeNode(val);
		}else {
		
		if( val > root.data) {
			root.right = insert(root.right, val ) ;
			int bf = BalanceFactor(root) ;
			
			if(bf == -2 ) {
				
				if( val > root.right.data) {
					root = RR(root) ;
				}else {
					root = RL(root) ;
				}
			}
		}else if( val < root.data) {
			root.left = insert(root.left, val ) ;
			int bf = BalanceFactor(root) ;
			
			if(bf == 2 ) {
				
				if( val  < root.left.data) {
					root = rotateright(root) ;
				}else {
					root = LR(root) ;
				}
			}
			
		}
		
		
		}
		return root ;
	}

	private static TreeNode LR(TreeNode root) {
		
		root.left = rotateright(root.left) ;
		root = rotateleft(root.left) ;
		return root ;
	}

	private static  TreeNode RL(TreeNode root) {
		
		root.right = rotateright(root.right) ;
		root = rotateleft(root) ;
		return root ;
		
		
	}

	private static TreeNode rotateright(TreeNode root) {
		
		TreeNode temp = root.left ;
		root.left= temp.right ;
		temp.right = root ;
		return temp ;
		
		
	}

	private static TreeNode RR(TreeNode root) {
		root = rotateleft(root);
		return root;
	}

	private static TreeNode rotateleft(TreeNode root) {
		
		TreeNode temp = root.right ;
		root.right = temp.left ;
		temp.left = root ;
		return temp ;
		
	}

	public static int BalanceFactor(TreeNode root2) {
		
		int hl = 0 ; int hr = 0 ;
		if( root2.right != null) {
			hr =  1 + TreeHeight(root2.right) ;
		}
		if(root2.left != null) {
			hl = 1 + TreeHeight(root2.left) ;
		}
		
		return(hl - hr) ;
	}

	private static int TreeHeight(TreeNode root) {
		 
		int lh = 0 , rh = 0  ;
		if(root.right != null) {
			rh = 1 + TreeHeight(root.right);
		}
		if(root.left != null) {
			lh = 1 + TreeHeight(root.left) ;
		}
		
		if(lh>rh) {
			return lh;
		}
		return rh ;
		
	}
	
	
}
