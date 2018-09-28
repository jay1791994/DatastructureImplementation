package StackImplementation;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;



public class DecimalToBinary {

	public static void main(String args[]) {
		
		
		System.out.println("ENTER NUMBER FOR WHICH BINARY FORM IS REQUIRED ");
		int t = 0 ;
		Scanner sc =  new Scanner(System.in);
		int num = sc.nextInt() ;
		Stack<Integer> stack = new Stack<Integer>();
		while( num >= 1 && t == 0 ) {
			
			if(num == 1) {
				t = 0 ;
			}
			stack.push(num%2) ;
			num = num /2 ;
			
		}
		
	
		 
		 while(!stack.isEmpty()) {
			 
			 System.out.print(stack.pop());
		 }
		
		
		
	}
}
