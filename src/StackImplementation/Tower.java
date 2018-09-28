package StackImplementation;
import java.util.Stack;

public class Tower {
	
       static int count = 0 ; 
	Stack stack = new Stack<Integer>();
	
	public void add(int d) {
		
		 if (!stack.isEmpty() && (int)stack.peek() <= d) {
		System.out.println("error");
		 } else {
		 stack.push(d);
		 }
		 }
	
	void MoveDisks(int n, Tower dest, Tower buffer) {
		count++ ;
		System.out.println("moved Disks in " + count + "  turn ");
		if(!this.stack.isEmpty())
		System.out.println( "tower0  "+  this.stack.peek());
	
		if(!dest.stack.isEmpty())
			System.out.println( "tower1 " +dest.stack.peek());
		
		if(!buffer.stack.isEmpty())
			System.out.println( "tower2 " + buffer.stack.peek());
		
		if( n > 0) {
		
			MoveDisks( n-1 , buffer, dest) ;
			MoveTop(dest) ;
			buffer.MoveDisks(n-1, dest, this );
		}
		
	}


	private void MoveTop(Tower dest) {
		
		int k = (int)this.stack.pop() ;
		dest.add(k);
		System.out.println("moved disks");
	}
	
}
