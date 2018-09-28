package CodingInterview;
import java.util.Scanner;


public class MergeShort{
	
	public static void main(String args[]) {
		
		
		
		int[] array = {10,12,3,42,5,7,21,43,33,22};
		
			MergeShort(array, 0 , array.length-1) ;
		for(int l=0 ; l < array.length ; l++) {
			System.out.print(array[l] +"  ");
		}
		
		
		
	}

	private static void MergeShort(int[] array, int p, int r) {
		
		
		if(p<r) {
		int mid =  (p+r)/2;
		MergeShort( array, p, mid) ;
		MergeShort(array, mid+1, r ) ;
		Merge( array, p, mid, r) ;
		
		}
	}

	private static void Merge(int[] array, int p, int mid, int r) {
		
		int[] c = new int[r-p+1] ;
		int i = p ; 
		int j = mid+1 ;
		int k = 0 ;
		
		while( i <=mid && j <= r) {
			
			if(array[i] < array[j]) {
				c[k] = array[i];
				i++;
				k++;
			}else {
			   c[k] = array[j];
				k++;
				j++;
				
			}
			
		}
		
		while(i <= mid) {
			c[k] = array[i];
		     i++;
			k++;
		}
		while(j <= r) {
			c[k] = array[j];
		    j++;
			k++;
		}
		
		int m = 0 ;
		for(int l= p ; l <= r ; l++) {
			array[l] = c[m] ;
			m++;
		}
	  }
	}