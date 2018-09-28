package LinkedListImplementation;

public class DoubleQueue {

	 Node front ;
	 Node rear ;
	 Node previous ;
	 
	 int size = 0 ;
	 
	 void enqueueF(int data) {
		  Node node = new Node(data) ;
		  
		 
		 if(size == 0 ) {
			size++;
			previous =  front = rear = node ;
	   }else {
		   node.previous = front ;
		   front.next = node ;
		   front = node ;
		   size++;
	   }
		 }
	 
	 Node dequeueF() {
		 
		 Node node =  null ;
		 if(size > 0 ) {
			 size--;
			node = front ;
			 front = front.previous ;
		 }else {
			 System.out.println("empty queue");
			 throw new NullPointerException();
		 }
		 
		 return node ;
	 }
	 
	 void enqueueR(int data) {
		 
		 Node node = new Node(data) ;
		 if(size == 0 ) {
			 size++;
			 front = rear = node ;
		 }else {
			 node.previous = rear ;
			rear.next = node ;
			rear = rear.next ;
			size++;
		 }
		}
	 
	 Node dequeueR() {
		 Node node = null ;
		 if(size > 0 ) {
			 node = rear ;
			 rear = rear.previous ;
		 }else {
			 System.out.println("empty queue");
			 throw new NullPointerException();
		 }
		 return node ;
	 }
	 
}
