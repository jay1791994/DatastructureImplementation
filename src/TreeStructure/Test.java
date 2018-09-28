package TreeStructure;

import java.util.Scanner;

import LinkedListImplementation.DoublyLinkedList;

public class Test {

	public static void main(String args[]) {
		
		BSTree bst = new BSTree();
		Scanner sc = new Scanner(System.in) ;
		
		int[] array = new int[11] ;
		for(int i=0 ; i < 11 ; i++) {
			 array[i] = sc.nextInt();
		}
		
		bst.root = bst.creatTreeFromArray(array,0, array.length-1) ;
		
		bst.InorderTraverasal(bst.root);
		System.out.println("height of tree is " + bst.TreeHeight(bst.root));
		
		bst.ListoflevelLinkedList(bst.root);
	 
		System.out.println("level order traversal");
		bst.levelOrderTraversal(bst.root);
		
		DoublyLinkedList db = new DoublyLinkedList();
		
		db.insert(1);
		db.insert(2);
		db.insert(3);
		db.insert(4);
		db.insert(5);
		db.insert(6);
		db.insert(7);
		
		db.TrackDoublyLinkedList(db.head, db.tail);
	}
}
