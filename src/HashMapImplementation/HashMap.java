package HashMapImplementation;

public class HashMap {

	final int capacity = 10 ;
	Entry[] entries = new Entry[capacity] ;
	private String nullkeyvaley = "There is no such key";
	
	void put(int key, String value) {
		
		
		int hash = hash(key) ;
		
		for( Entry e = entries[hash] ; e!=null ; e = e.next) {
			
		      if(e.key == key) {
		    	  System.out.println("it happened");
		    	  e.value = value ;
		      }
			
			
			
		}
		
		addEntry(hash, key, value) ;
		
		
		
		
		
	}

	private void addEntry(int hash, int key, String value) {
		
		
		System.out.println("the value " + value + "added at " + hash  + "location");
		
		Entry e = entries[hash] ;
		if(e == null) {
			entries[hash] = new Entry(key, value, null) ;
		}else {
			entries[hash] = new Entry(key, value, e) ;
		}
		
		
	}

	private int hash(int key) {
		// TODO Auto-generated method stub
		return key % 10;
	}
	
	
	String get(int key) {
		
		int hash = hash(key);
		
		Entry e = entries[hash] ;
		
		while(e != null) {
			if(e.key == key) {
				return e.value ;
			}
			e = e.next ;
		}
		
		return nullkey() ;
	}

	private String nullkey() {
		// TODO Auto-generated method stub
		return nullkeyvaley  ;
	}

}

