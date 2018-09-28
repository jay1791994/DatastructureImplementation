package LinkedListImplementation;

public class Node {

	public int data ;
	public Node next ;
	Node previous ;
	int priority ;
	
	public Node(int data) {
		this.data =  data ;
	}
	
	public Node() {
		
	}
	
	public Node(int data , int prio) {
		this.data = data ;
		this.priority =  prio ;
	}
}


