package StackImplementation;
import java.util.Iterator;

public class TOHRunner {
	
	public static void main(String args[]) {
		
		Tower[] tower = new Tower[3];
		tower[0] =  new Tower();
		tower[1] = new Tower();
		tower[2] =  new Tower();
		for(int i= 10 ; i > 0 ; i--) {
			tower[0].add(i);
		}
		
		tower[0].MoveDisks( tower[0].stack.size(),  tower[1] , tower[2]) ;
		System.out.println(tower[1].stack.size());
		
		Iterator itr = tower[1].stack.iterator() ;
		System.out.println("Tower 1 Disks");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("tower 0 size" + tower[0].stack.size());
        
	}
	}
	
	
