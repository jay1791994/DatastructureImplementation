package CodingInterview;

import LinkedListImplementation.LinkedList;
import LinkedListImplementation.Node;

public class LoopDetection {
	
	public static void main(String args[]) {
		
		
		LinkedList list =  new LinkedList() ;
		Node node = new Node(4) ;
		Node node1 =  new Node(13);
		
		
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(node);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.insert(11);
		list.insert(12);
		
	    list.insert(node1);
	    
	    node1.next = node ;
	    
	    detectLoop(list);
	    
		
	}
	
	public static void detectLoop(LinkedList l) {
		
		Node head = l.head ;
		Node pointerslow = l.head ;
		Node pointerfast = l.head ;
		
	while((pointerfast != null) ) {
		
		
			
			pointerslow = pointerslow.next ;
			pointerfast = pointerfast.next ;
			
			if(pointerfast != null) {
				pointerfast =  pointerfast.next ;
			}
			if(pointerslow ==  pointerfast) {
				break ;
			}
			System.out.println("data is in this turn");
			System.out.println(pointerslow.data);
			System.out.println(pointerfast.data);
		}
	
	   System.out.println("two pointers");
		System.out.println(pointerslow.data) ;
		System.out.println(pointerfast.data);
		
		System.out.println("to detect start of loop");
		pointerslow = l.head ;
		
		while(pointerslow != pointerfast) {
			pointerslow = pointerslow.next ;
			pointerfast = pointerfast.next ;
		}
		
		System.out.println("the node having data " + pointerfast.data + " is starting of loop");
		
		
	}
	



}
