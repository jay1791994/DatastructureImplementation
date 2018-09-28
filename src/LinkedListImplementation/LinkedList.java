package LinkedListImplementation;

public class LinkedList {

	public Node head ;
	
	public void insert(int data) {
		
		Node newnode = new Node();
		newnode.data = data ;
		newnode.next =  null ;
		
		if(head == null) {
			head = newnode ;
		
		}else {
			
			Node n = head ;
			while(n.next != null) {
				n = n.next ;
			}
			n.next = newnode ;
		}
		
	}
public void insert(Node node) {
		
		Node newnode = node ;
		
		newnode.next =  null ;
		
		if(head == null) {
			head = newnode ;
			
		}else {
			
			Node n = head ;
			while(n.next != null) {
				n = n.next ;
			}
			n.next = newnode ;
		}
		
	}
	 
	void show() {
		
		try {
		Node n = head ;
		while(n.next != null) {
		
			System.out.println(n.data);
			 n = n.next;
			
		}
		System.out.println(n.data);
		}catch(NullPointerException e) {
			System.out.print("list has no data");
		}
	}
	
	 int size() {
		 Node n = head ;
		 int count = 1 ;
			while(n.next != null) {
			
			  n = n.next;
				 count++;
				
			}
			return count ;
	 }
	 
	 void add(int index , int data) {
		 
		 Node newnode = new Node();
		 newnode.data = data ;
		 int count = 0 ;
		 
		 Node n =  head ;
		 if(index == 0 ) {
			 newnode.next = head;
			 head = newnode ;
		 }else {
		 while(count != (index-1)) {
			 n = n.next ;
			 count++ ;
		 }
		 
		Node temp = n.next ;
		n.next = newnode ;
		newnode.next = temp ;
		 
		 
		 }
		 
	 }
	 
	 void remove (int index) {
		 
		 Node n =  head ;
		 int count = 0 ;
		 
		 if(count == 0 ) {
			 head = head.next;
		 }else {
		 while(count != index-1) {
			 n = n.next ;
			 count++;
		 }
		 }
		 Node temp = n.next ;
		 n.next = temp.next ;
		 
	 }
	 
	 void clear() {
		 head =  null ;
	 }
	 
	 void removeDuplicated() {
		 
		 Node node1 = head ;
		 Node node = head.next ;
		 int dataremoval = head.data ;
		 
		 while( node != null) {
			 
			 if( dataremoval == node.data) {
				 if(node.next != null)
				 node = node.next ;
				 else {
					 node1.next = null ;
					 node = node.next ;
				 }
			 }else {
				 node1.next = node ;
				 node1 = node ;
				 dataremoval = node.data ;
				 node = node.next ;
			 }
			 
		 }
		 
		 this.show();
	 }
}
