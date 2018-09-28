package CodingInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParenthesisPairs{
	
	   public static void main(String args[]) {
		   
		   
		   ArrayList<PrimeNumber> array = new ArrayList<>();
		   Queue q = new LinkedList<PrimeNumber>() ; 
		   q.add(new PrimeNumber(1, 0,0,0));
		   
		   while( !q.isEmpty()) {
			   
			  
			   PrimeNumber p = (PrimeNumber)q.remove() ;
			   array.add(p);
			   if(p.i < 2 ){
				   q.add(new PrimeNumber(p.data*3, p.i+1, p.j , p.k));
			   }
			   if(p.j < 2 ){
				   q.add(new PrimeNumber(p.data*5, p.i, p.j+1 , p.k));
			   }
			   if(p.k < 2 ){
				   q.add(new PrimeNumber(p.data*7, p.i , p.j , p.k+1));
			   }
			  }
		
		   System.out.println("The total numbers are " + array.size());
		   
		   for(int k=0; k < array.size() ; k++) {
			   
			   PrimeNumber p = (PrimeNumber)array.get(k);
			   System.out.println( p.data  );
		   }
		   }
		   
		   
		   
		   
		   
	  
}
