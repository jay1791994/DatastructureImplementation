package Heap;

public class HeapTester {
	
	public static void main(String args[]) {
		
		
		Heap heap =  new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(23);
		heap.insert(21);
		heap.insert(9);
		heap.insert(31);
        heap.insert(76);
				
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
		System.out.println(heap.remove());
	}

}
