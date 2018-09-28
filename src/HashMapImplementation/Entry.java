package HashMapImplementation;

// let us consider a hashmap having key values only integer and value are string..Like student roll number and name

public class Entry {

	
   public int key ;
   public String value ;
   Entry next ;
	
   Entry(int key, String name , Entry Next){
	   this.key = key ;
	   this.value = name ;
	   this.next = Next ;
   }
	
	
}
