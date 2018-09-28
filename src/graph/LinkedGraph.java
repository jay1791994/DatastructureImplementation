package graph;

import java.util.Scanner;

public class LinkedGraph {
	GraphNode[] array ;
	
		public LinkedGraph(int num) {
			
			 this.array = new GraphNode[num];
		
		}
		
		void insertedge(int i , int j) {
			
			if(this.array[i] == null) {
				array[i] =  new GraphNode (i) ;
			}
		
				GraphNode node = array[i];
				
				while(node.next != null) {
				  node = node.next ;	
				}
				node.next = new GraphNode(j) ;
			
		}
		
		public int outdegree(int i) {
			GraphNode node = array[i];
			
			  int count = 0 ; 
			  if(node == null) {
				  return 0 ;
			  }
			  while(node.next != null) {
				  count++ ;
				  node = node.next ;
			  }
			  
			return count ;
		}
		
		public int inDegree(int j) {
			
			GraphNode node ;
			int count = 0 ;
			
			for(int i=0 ; i < array.length ; i ++) {
				node = array[i];
				
				if(i == j ) {
					continue ;
				}
				while(node != null) {
					
					if(node.data == j) {
						count++ ;
						break;
					}
					node = node.next ;
				}
			}
			return count++;
		}
			
		
		void showLinkedList(int i) {
			
			GraphNode node = array[i];
			while(node != null) {
				System.out.print(node.data);
				node = node.next;
			}
		
		}
}
