package RecursiveProblems;

public class ChessBoardBackTracking {
	
	static int count = 0 ;
	public static void main(String args[]) {
		
		int[][] chess = new int[8][8];
		
		for(int i=0 ; i < 8 ; i++) {
	  for(int j=0 ; j <8 ; j++) {
				chess[i][j] = 0 ;
			}
		}
		
		placetheQueens(8, chess) ;
		
		System.out.println("the ways of printing are " + count);
		
	}

	private static void placetheQueens(int i, int[][] chess) {
		
		QueensHelper(0 , chess) ;
		
	}

	private static void QueensHelper(int i, int[][] chess) {
		
		if(i == chess.length) {
			System.out.println();
			System.out.println();
			count++ ;
			//System.out.println("printing");
			printchessBoard(chess) ;
		}else {
	
		for(int j = 0 ; j < chess.length ; j++) {
			
			if(ifsafe( i, j , chess)){
				chess[i][j] = 1 ;
				QueensHelper(i+1 , chess) ;
				chess[i][j] = 0 ;
			   }
					
				
			
		}
		}
	}

	private static void printchessBoard(int[][] chess) {
		
		for(int i = 0 ; i < chess.length ; i++) {
			System.out.println();
			for(int j= 0 ; j < chess.length ; j++) {
				System.out.print( chess[i][j] +" ");
			}
		}
		
	}

	private static boolean ifsafe(int i, int j, int[][] chess) {
		
		
		for(int k=0 ;  k < chess.length ; k++) {
			if(chess[k][j] == 1)
				return false ;
		}

		for(int k=0 ;  k < chess.length ; k++) {
			if(chess[i][k] == 1)
				return false ;
		}
		
		
		for(int l = 0 ; l < chess.length ; l++) {
			for(int m = 0 ; m < chess.length ; m++) {
				if((l+m) == (i+j)){
					if(chess[l][m] == 1)
						return false ;
				}
				if((l- m) == (i-j)){
					if(chess[l][m] == 1)
						return false ;
				}
						
						
			}
		}
		return true ;
	}

}