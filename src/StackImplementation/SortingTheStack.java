package StackImplementation;
import java.util.Stack;

public class SortingTheStack {
	
	public static void main(String args[]) {
		
		Stack s1 = new Stack<Integer>();
		
		s1.push(5);
		s1.push(4);
		s1.push(3);
		s1.push(8);
		s1.push(9);
		s1.push(1);
		s1.push(10);
		s1.push(7);
		
		Stack s2 = Sortthestack(s1);
		
		while(!s2.isEmpty()) {
			System.out.println(s2.pop());
		}
		
		
	}

	private static Stack Sortthestack(Stack s1) {
		// TODO Auto-generated method stub
		
		Stack s2 = new Stack<Integer>();
		int moves = 0 ;
		if(s2.isEmpty()) {
			s2.push(s1.pop());
			
		}
		
			
			while(!s1.isEmpty()) {
			
			int m = (int)s1.pop();
			
			while( (!s2.isEmpty() && (int)s2.peek() > m)) {
				s1.push(s2.pop());
				moves++;
			}
			
			s2.push(m);
			
			while(moves > 0 ) {
				s2.push(s1.pop());
				moves-- ;
			}
			}
		
		 return s2 ;
	}

}
