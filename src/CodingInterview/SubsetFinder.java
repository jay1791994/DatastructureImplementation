package CodingInterview;
import java.util.LinkedList;

public class SubsetFinder {
	
	static int count = 0 ;
static int hfc = 0 ; //number of helper function call
	
	 public static void main(String args[]) {
		 
		 int[] array =  new int[4];
		  
		 array[0] = 2 ;
		 array[1] = 4 ;
		 array[2] =  6;
		 array[3] = 10 ;
		 
		 
		 SubsetFinder str = new SubsetFinder();
		 str.all_subset(array);
	
		System.out.println("number of subset is " + count); 
		System.out.println("helper function call" + hfc);
		
	 }
	 
 void all_subset(int[] arr) {
		 
		 int[] subset = new int[arr.length] ;
		 int total = 0 ;
		 helper(arr, subset, arr.length - 1 , total) ;
	 }

	private  void helper(int[] arr, int[] subset, int i, int total) {
		
		hfc ++ ;
		if(i < 0) {
			printsubset(subset) ;
		}else {
		subset[i] = 0 ;
		
		helper(arr, subset, i-1 , total) ;
		
		
		subset[i] = arr[i] ;
		
		helper(arr, subset, i-1 , total) ;
		
		}
	}

	private  void printsubset(int[] subset) {
		// TODO Auto-generated method stub
		int value = 0 ;
		System.out.print("subset is");
		for(int i=0; i < subset.length ; i++) {
			value = value + subset[i] ;
			System.out.print(subset[i]);
		}
	     if( value == 16 ) {
	    	 count ++ ;
	     }
	     System.out.println();
	}
	 
}
