package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphReperesentation {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of nodes");
		int n = sc.nextInt();

		System.out.println(" fill the adjacency matrix ");

		int adj[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adj[i][j] = sc.nextInt();
			}
		}

		System.out.println("ADJECENCY MATRIX IS");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}

		GraphReperesentation graph = new GraphReperesentation();
		graph.kruskalsAlgo(adj, n);
        graph.dijkstraalgo(adj, n, 0);
	}

	private void dijkstraalgo(int[][] adj, int n, int k) {

		int[][] cost = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (adj[i][j] == 0) {
					cost[i][j] = Integer.MAX_VALUE - 2000;
				} else {
					cost[i][j] = adj[i][j];
				}

			}
		}

		int[] distance = new int[n];
		int[] pred = new int[n];
		int[] visited = new int[n];

		for (int i = 0; i < n; i++) {

			visited[i] = 0;
			distance[i] = cost[k][i];
			pred[i] = k;
		}

		distance[k] = 0;
		int count = 1;
		int min_value;
		visited[k] = 1;
		int v = k;
		

		while (count < n) {

			min_value = Integer.MAX_VALUE - 2000;

			for (int j = 0; j < n; j++) {

				if (distance[j] < min_value && visited[j] == 0) {

					min_value = distance[j];
					v = j;

				}
			}
			visited[v] = 1;

			for (int j = 0; j < n; j++) {
				if( visited[j] == 0) {
				if (distance[j] > cost[v][j] + distance[v]) {
					pred[j] = v;
					distance[j] = cost[v][j] + distance[v];
				}
				}
			}
             
			count++;
			
		}
		
		System.out.println("print the shortest paths") ;
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println("Path from " + i + " to " + k +" is " );
			System.out.print( i +"  ");
			
			if( i != k) {
				int j  = i ;
				do {
					j = pred[j];
					System.out.print( j +" ");
				}while( j != k) ;
			}
			
		
			
			
			
			
		}
			
			
		}

	
		
		
		
		
		
		
		


	@SuppressWarnings("rawtypes")
	private void kruskalsAlgo(int[][] adj, int n) {

		class Edge implements Comparable {
			int weight, start, end;

			public Edge(int weight, int start, int end) {
				this.end = end;
				this.start = start;
				this.weight = weight;
			}

			@Override
			public int compareTo(Object arg0) {
				// TODO Auto-generated method stub
				Edge e = (Edge) arg0;

				return this.weight - e.weight;
			}

		}

		ArrayList edgearray = new ArrayList<Edge>();
		int count = 0;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (adj[i][j] != 0) {
					Edge e = new Edge(adj[i][j], i, j);
					edgearray.add(e);
				}
			}

		}

		Collections.sort(edgearray);

		System.out.println("sorted array is like beklow ");
		Iterator itr = edgearray.iterator();
		while (itr.hasNext()) {
			Edge e = (Edge) itr.next();
			System.out.println(e.start + " " + e.end + " " + e.weight);
		}

		int noofedgesinspan = n - 1;
		int cnt = 0;
		boolean[] visited = new boolean[n];
		int mincost = 0;

		for (int i = 0; i < n; i++) {
			visited[i] = false;
		}

		while (noofedgesinspan > 0) {

			Edge e = (Edge) edgearray.get(cnt++);

			if (visited[e.start] == false || visited[e.end] == false) {
				mincost = mincost + e.weight;
				noofedgesinspan--;
			}

			if (cnt > edgearray.size()) {
				System.out.println("this is exexuted6" + "");
				break;
			}

		}

		System.out.println("cost of minimun span tree is " + mincost);
	}

	private int primsAlgo(int[][] adj, int n) {

		// Adjecency matrix gives the grpah representation
		int min_cost = 0;
		int[][] cost = new int[n][n];
		int[][] span = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				span[i][j] = 0;
				if (adj[i][j] > 0) {
					cost[i][j] = adj[i][j];
				} else {
					cost[i][j] = Integer.MAX_VALUE;
				}

			}
		}

		int[] visited = new int[n];
		int[] distance = new int[n];
		int[] from = new int[n];
		int min_value = Integer.MAX_VALUE;
		int noofedges = n - 1;
		int v = 0;
		int u = 0;
		for (int k = 0; k < n; k++) {

			distance[k] = cost[0][k];
			from[k] = 0;

		}

		distance[0] = 0;
		visited[0] = 1;

		while (noofedges > 0) {

			min_value = Integer.MAX_VALUE;

			for (int i = 0; i < n; i++) {

				if (distance[i] < min_value && visited[i] == 0) {

					min_value = distance[i];
					v = i;

				}

			}

			u = from[v];
			span[u][v] = min_value;
			span[u][v] = min_value;
			visited[v] = 1;
			noofedges--;

			for (int i = 0; i < n; i++) {

				if (distance[i] > cost[v][i] && visited[i] == 0) {

					distance[i] = cost[v][i];
					from[i] = v;
				}

			}
			min_cost = min_cost + cost[v][u];

		}

		return min_cost;
	}

}
