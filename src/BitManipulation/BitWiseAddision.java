package BitManipulation;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class BitWiseAddision {
	public static void main(String args[]) {
		
		String a = "100110011";
		String b = "101101" ;
		
		int diff = Math.max(a.length(), b.length()) - Math.min(a.length(), b.length()) ;
		String str = "" ;
		while(diff >  0) {
			str = str +"0";
			diff--;
		}
		
		if(a.length() > b.length()) {
			b = str + b ;
		}else if(b.length() > a.length()) {
			a = str + a ;
		}
		
		int sum = 0 ;
		int carry = 0 ;
		String result = "";
		
		for(int i = a.length()-1  ; i >= 0 ; i--) {
			
			int b1 = a.charAt(i) - 48 ;
			int b2 = b.charAt(i) - 48 ;  ; 
			
			System.out.println("value of a" + b1);
			System.out.println("value of b" + b2
					);
			sum =( b1^b2^carry )  ;
			carry = (b1 & b2) | (b2 & carry) | (b1 & carry) ;
			result = Integer.toString(sum) + result ;
		}
		
		
		if(carry == 1) {
			result = "1" + result ;
		}
	    System.out.println(a);
	    System.out.println(b);
		System.out.println(result);
		
		
	}
}

