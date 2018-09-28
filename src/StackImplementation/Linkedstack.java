package StackImplementation ;

import java.util.EmptyStackException;

public class Linkedstack {
 
	
	Nodes top ;
	
	void push(int data) {
		Nodes node = new Nodes(data);
		node.next =  top ;
		top = node ;
		}
	
	int pop() {
		if( top != null) {
			int m =  top.data ;
			top = top.next;
			return m ;
		}else {
			throw new EmptyStackException();
		}
	}
	
	int peek() {
		return top.data ;
	}
	
	

}