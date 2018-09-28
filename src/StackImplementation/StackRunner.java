package StackImplementation;

public class StackRunner {

	public static void main(String args[]) {
		
		Linkedstack stack = new Linkedstack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3) ;
		stack.push(4);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		stack.push(5);
		stack.push(6);
		stack.push(10);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}
}
