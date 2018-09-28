package LinkedListImplementation;

import java.util.EmptyStackException;

public class LinkedQueue {
	
	Node first , last ;
	
	void enqueue(int data) {
		Node newnode = new  Node();
		newnode.data = data ;
		newnode.next = null ;
		
		if(first == null) {
		    first = newnode ;
		    last = first ;
		}else {
			last.next =newnode ;
			last = last.next ;
		}
		}
	
	int deque() {
		if(first != null) {
			int m = first.data ;
			first = first.next ;
			return m ;
		}else {
			throw new EmptyStackException();
		}
	}

}
