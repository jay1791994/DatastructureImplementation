package RecursiveProblems;

import java.util.Scanner;

public class ValidBrackets {

	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in) ;
		
		int num = sc.nextInt() ;
		
		PrintValidBrackets(num) ;
	}

	private static void PrintValidBrackets(int num) {
		
		String str = "";
		brackets(str, 0 , 0 , num) ;
		
	}

	private static void brackets(String str, int open, int close, int num) {
	
	     if(str.length() == num * 2 && str.charAt(num*2 - 1) != '(') {
	    	 System.out.println(str);
	     } else if(open > num || open < close){
	    	 return ;
	    }else {
	    	if(open == close) {
	    		brackets(str+'(', open+1, close, num);
	    	} 
	    	if(open > close) {
	    		brackets(str+'(', open+1, close, num);
	    		brackets(str+')', open, close+1, num);
	    	}
	    		
	    	}
	    	
	    }
		
		
	}

