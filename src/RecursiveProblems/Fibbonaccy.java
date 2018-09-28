package RecursiveProblems;

import java.util.Scanner;

public class Fibbonaccy {
 
	public static void main(String args[]) {
		
		int a = 0 ;
		int b = 1 ;
		int c = a + b ;
		Scanner sc = new Scanner(System.in) ; 
		
		System.out.println("Write fibbobaccy series up to number ");
		int num = sc.nextInt() ;
		System.out.print(a +" ");
		System.out.print(b +" ");
		while(c <  num) {
			
			System.out.print(c + " ");
			a = b ;
			b = c ;
			c = a + b ;
		}
	}

}
