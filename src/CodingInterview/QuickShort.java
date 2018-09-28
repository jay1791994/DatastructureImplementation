package CodingInterview;
import java.util.Scanner;


public class QuickShort{
	
	public static void main(String args[]) {
		
		
		
		int[] array = {10,12,3,42,5,7,21,43,33,22};
		
		Quickshort(array, 0, array.length-1) ;
		
		for(int l=0 ; l < array.length ; l++) {
			System.out.print(array[l] +"  ");
		}
		
		
		
	}

	private static void Quickshort(int[] array, int p, int r) {
		
		if(p < r) {
		  int i = partition(array, p, r) ;
		
		  Quickshort(array, p, i-1);
		  Quickshort(array, i+1, r) ;
			
		}
		
		
	}

	private static int partition(int[] array, int p, int r) {
		
		
		
		int pivot  = array[r] ;
		int i =  p-1 ;
		
		for(int l=p; l < r ; l++) {
			
			if(array[l] < pivot) {
				
				i = i +1 ;
				
			int temp = array[l];
			array[l] = array[i];
			array[i] = temp ;
			
			}
			
		}
	
		array[r] = array[i+1];
		array[i+1] = pivot ;
		
		
	        return i+1;
		
		
		
}
	 
	
	
	
}
	