package StackImplementation;
import java.util.Stack;

public class Myqueue {

	Stack stack1 = new Stack<Integer>();
	Stack stack2 = new Stack<Integer>();
	int size = 0 ;
	int p = 1 ;
	
	void enqueue(int data) {
		size++;
	
		if(stack2.isEmpty()) {
		stack1.push(data);}
		else {
			for(int i=0 ;  i < size ; i++) {
				stack1.push(stack2.pop());
			}
			stack1.push(data);
		}
		p=1 ;
	}
	int deque() {
		size-- ;
		if ( p ==  1) {
		for(int i=0 ;  i < size ; i++) {
			stack2.push(stack1.pop());
		}
		int m = (int)stack1.pop();
		p = 2 ;
		return m; }
		else {
		int m = (int)stack2.pop();
		
		return m ;
	}
	}}
		
		
	
	

