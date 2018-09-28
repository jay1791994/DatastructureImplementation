package TreeStructure;

public class Runner {
	
	public static void main(String argsd[]) {
		
		
		AVLTree  tree  = new AVLTree();
		
		tree.root = tree.insert(tree.root , 15);
		tree.root = tree.insert(tree.root , 10);
		 System.out.println(tree.BalanceFactor(tree.root));
		tree.root = tree.insert(tree.root , 16);
		tree.root = tree.insert(tree.root , 8);
		 System.out.println(tree.BalanceFactor(tree.root));
     	tree.root = tree.insert(tree.root , 19);
		tree.root = tree.insert(tree.root , 20);
		tree.root = tree.insert(tree.root , 4);
		 System.out.println(tree.BalanceFactor(tree.root));
		tree.root = tree.insert(tree.root , 5);
		 System.out.println(tree.BalanceFactor(tree.root));
		tree.root = tree.insert(tree.root , 6); 
		 System.out.println(tree.BalanceFactor(tree.root));
			tree.root = tree.insert(tree.root , 2);
			tree.root = tree.insert(tree.root , 3);
			tree.root = tree.insert(tree.root , 7);
			tree.root = tree.insert(tree.root , 9);
			tree.root = tree.insert(tree.root , 11);
		
         System.out.println(tree.BalanceFactor(tree.root));
        
        
		
        
		
		
		
		
		
	
		 }

}
