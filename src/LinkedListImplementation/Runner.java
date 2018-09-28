package LinkedListImplementation;

public class Runner {

	public static void main(String args[]) {
		
		LinkedList list = new LinkedList();
		
		list.insert(2);
		list.insert(2);
		list.insert(2);
		list.insert(3);
		list.insert(3);
		list.insert(1);
		list.insert(5);
		list.insert(1);
		list.insert(1);
		list.insert(8);
		list.insert(1);
		
		list.removeDuplicated();
	}
	
	
	
}
