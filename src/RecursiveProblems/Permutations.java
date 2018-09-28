package RecursiveProblems;
import java.util.HashSet;
import java.util.Set;

public class Permutations {
	static int count = 0 ; 
	 static Set<String> set =  new HashSet<String>();
	
	public static void main(String args[]) {
		
		String str = "patelp" ;

		char[] charaaray = str.toCharArray() ;
		
		permutation(str);
		
		System.out.println("number of permutations are " + count);
		
	}
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) { 
	    	if( set.contains(prefix)) {
	    		System.out.println("already printed");
	    	}else { 
	    	System.out.println(prefix);
	   	set.add(prefix);
	    	count++ ;
	    	}
	    	}
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }


}
}