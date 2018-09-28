package LinkedListImplementation;

public class PriorityQueue {

	
	Node top ;
	int size = 0 ; 
	
	void insert(int data, int priority) {
		
		Node node = new Node(data, priority) ;
		
		if(size == 0) {
			size++;
			top = node ;
		}else {
			Node nodetemp = top ;
			
			if(top.priority < priority) {
				node.next = top ;
				top.previous = node ;
				top = node ;
				
				size++ ;
				
			}else {
			
			while(nodetemp.next != null && nodetemp.priority > priority) {
				nodetemp = nodetemp.next ;
			}
			
			if(nodetemp.priority < priority) {
			System.out.println("nodetemppriority "+ nodetemp.priority + "Priority is" + priority );
			Node temp =  nodetemp.previous ;
			node.previous = temp ;
		    nodetemp.previous.next = node ;
		    node.next = nodetemp ;
		    size++;
			
				
			}else {
			System.out.println("node data is " + node.data);
			nodetemp.next = node ;
			node.previous = nodetemp ;
			size++ ;
			
			}
		}
		}
		
	}
	
	void dequeue() {
		
		Node node = top ;
		System.out.println(top.data + "with the priority of " +  top.priority +"has been dequed");
		top = top.next ;
		size-- ;
		
	}
}
