package CodingInterview;
import java.util.Scanner;


public class Arithmatic {
	//The way of finding the maximum of two numbers without using comparison operator
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		int c = a - b;
		System.out.println("binary form of c is " + Integer.toBinaryString(c));
		c = (c >> 31 )& (0b00000000000000000000000000000001);
		System.out.println("after shifting binary form of c is " + Integer.toBinaryString(c));
		
		System.out.println("value of c is" + c);
        int max = a - c * (a - b);
		System.out.println("Maximum number is "+ max);
		
		
	}
}
	