package Heap;

public class Heap {
	
	protected int[] data = new int[100] ;
	
	public Heap() {
		
		this.data[0] = 0 ;
		
	}
	
	public void insert(int value) {
		
		this.data[0]++ ;
		this.data[this.data[0]] = value ;
		this.bubbleup(this.data[0]) ;
		
	}

	private void bubbleup(int index) {
		
		int parentindex = index / 2 ;
		
		if((index == 1) || (this.data[parentindex] >  this.data[index])) {
			return ;
		}
		
		int maxvalue = this.data[index];
		this.data[index] = this.data[parentindex];
		this.data[parentindex] = maxvalue ;
		
		this.bubbleup(parentindex);
		
	}
	
	
	public int remove() {
		
		int maxvalue = this.data[1] ;
		this.data[1] = this.data[this.data[0]];
		this.data[this.data[0]] =  0 ; 
		this.data[0]-- ;
		this.sinkdown(1) ;
		return maxvalue ;
		
		
	}
	private void sinkdown(int index) {
		
		int rightnext = index * 2 ;
		int leftnext = (index * 2 ) + 1 ;
		int maxindex ;
		if( rightnext > this.data[0] ) {
			return ;
		}else {
			
			if( this.data[rightnext] > this.data[leftnext]) {
				maxindex = rightnext ;
			}else {
				maxindex = leftnext ;
			}
		}
		
		if( this.data[index] > this.data[maxindex]) {
			return ;
		}
		
		int temp = this.data[maxindex];
		this.data[maxindex] = this.data[index];
		this.data[index] = temp ;
		
		sinkdown(maxindex);
		
		
		
		
	}


	public void show() {
		
		for(int k = 1 ; k <= this.data[0] ; k++) {
			System.out.print( this.data[k] +"  ");
		}
	}
	
	

}
