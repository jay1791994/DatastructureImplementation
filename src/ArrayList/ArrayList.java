package ArrayList;

import java.util.Arrays;

public class ArrayList {

	int size = 0 ;
	static int capacity = 10 ;
	int array[] = new int[capacity];
	
	void add(int data) {
		if( size== capacity) {
			ensurecapacity();
		}
		array[size++] = data ;
		System.out.println("size " + size);
	}

	private void ensurecapacity() {
		System.out.println("size increased");
		// TODO Auto-generated method stub
		array = Arrays.copyOf(array, size*2) ;
	}
	
	public void show() {
		for(int i=0 ; i < size ;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("size " + size);
	}
	
	public void remove(int index ) {
		
		if(index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		     for(int i=index ; i < size-1 ; i++) {
		    	 array[i] = array[i+1];
		     }
		    
		     size = size -1 ;
		     System.out.println("size " + size);
		}
	public void insertatIndex (int index , int data) {
		if(index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if( size== capacity) {
			ensurecapacity();
		}
		
        array[size] = 0 ;
		for(int i =  size-1; i >= index-1; i--) {
			array[i+1] = array[i];
		
		}
		
		array[index] = data ;
		size++;
		
	}
}