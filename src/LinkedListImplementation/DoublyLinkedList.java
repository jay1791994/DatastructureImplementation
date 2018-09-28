package LinkedListImplementation;

public class DoublyLinkedList {
	
	public Node head ;
	public Node tail ;
		
	
	public void insert(int data) {
		if(head == null) {
			head = new Node() ;
			tail =  head ;
			head.data = data ;
			head.previous = null ;
		}else {
			Node node =  head ;
			while(node.next != null) {
				node = node.next ;
			}
			Node newnode = new Node();
			newnode.data = data ;
			node.next = newnode ;
			newnode.previous = node ;
			tail = newnode ;
		}
	}
	
	public void TrackDoublyLinkedList(Node head, Node tail) {
		System.out.println("Head to Tail");
		Node node = head ;
		while(node != null) {
			System.out.print(node.data);
			node = node.next ;
		}
		
		System.out.println("Tail to Head");
		node = tail ;
		while(node != null) {
			System.out.print(node.data);
			node = node.previous ;
		}
	}

}
