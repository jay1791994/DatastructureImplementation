package graph;

import java.util.Scanner;

public class Test {

	
	public static void main(String args[]) {
Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the number of nodes");
	   int n = 	sc.nextInt();
	   
	   System.out.println(" fill the adjacency matrix " );
	   
	   int adj[][] = new int[n][n];
	   
	   for(int i=0 ; i < n ; i++) {
		   for(int j=0 ; j< n ;j++) {
			     adj[i][j]  = sc.nextInt();
		   }
	   }
	   
		System.out.println("ADJECENCY MATRIX IS");
		 for(int i=0 ; i < n ; i++) {
			   for(int j=0 ; j< n ;j++) {
				     System.out.print( adj[i][j] + " ");
			   }
			   System.out.println();
		   }
		 
		 System.out.println("depth first serach");
		 boolean[]  visited = new boolean[n];
			for(int k=0; k< n ;k++) {
				visited[k] = false ;
			}
		 DFS(1, adj, n, visited);
		
	}
	static void DFS(int i , int[][] adj , int nodes, boolean[] visited) {
		
		
		visited[i]= true;
		System.out.println(i);
		for(int j=0 ; j < nodes ; j++) {
			
			if((visited[j] == false) &&  adj[j][i] == 1) {
					DFS(j, adj, nodes, visited);
			}
			
		}
		
	}
}
