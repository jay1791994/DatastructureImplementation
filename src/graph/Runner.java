package graph;

import java.util.Scanner;

public class Runner {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of vertex");
		int num = sc.nextInt() ;
		
		System.out.println("enter number of edges");
		int edges = sc.nextInt() ;
		
		LinkedGraph lg = new LinkedGraph(num);
		
		System.out.println("Read edges");
		
		for(int i = 0 ; i < edges ; i++) {
			int a = sc.nextInt() ;
			int b = sc.nextInt() ;
			
			lg.insertedge(a, b);
		}
		
		System.out.println("number of outdree for vertex 0: " + lg.outdegree(0)	+ "Indgree : " + lg.inDegree(0));
		System.out.println("number of outdree for vertex 1: " + lg.outdegree(1)	+ "Indgree : " + lg.inDegree(1));
		System.out.println("number of outdree for vertex 2: " + lg.outdegree(2)	+ "Indgree : " + lg.inDegree(2));
		System.out.println("number of outdree for vertex 3: " + lg.outdegree(3)	+ "Indgree : " + lg.inDegree(3));
		System.out.println("number of outdree for vertex 4: " + lg.outdegree(4)	+ "Indgree : " + lg.inDegree(4));
		System.out.println("number of outdree for vertex 5: " + lg.outdegree(5)	+ "Indgree : " + lg.inDegree(5));
		
	  
		System.out.println("node 0");
		lg.showLinkedList(0);
		System.out.println();
		System.out.println("node 1");
		lg.showLinkedList(1);
		System.out.println();
		System.out.println("node 2");
		lg.showLinkedList(2);
		System.out.println();
		System.out.println("node 3");
		lg.showLinkedList(3);
		System.out.println();
		System.out.println("node 4");
		lg.showLinkedList(4);
		System.out.println();
		System.out.println("node 5");
		System.out.println();
		lg.showLinkedList(5);
	
		

	}
}
