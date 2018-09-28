package StackImplementation;

import java.util.Scanner;
import java.util.Stack;

public class WellFormedParenthesis {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the parenthesis pairs for velid check");
		
		String str = sc.next() ;
		Stack stack = new Stack<Character>();
		
		char[]  chararray = str.toCharArray() ;
		int i = 0 ;
		
		while( i < chararray.length) {
			
			if( chararray[i] == '(') {
				stack.push(chararray[i]) ;
			}else {
				if(!stack.isEmpty()) {
					stack.pop() ;
				}else {
					System.out.println("error");
					break ;
				}
			}
			i++;
		}
	    
	   if(i == chararray.length) {
		  if(stack.isEmpty()) {
			  System.out.println("well formed parenthesis");
		  }else {
			  System.out.println("not well formed");
		  }
	   }
		
	}
}
