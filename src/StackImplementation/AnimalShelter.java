package StackImplementation;

public class AnimalShelter {
	
	Animal firstAnimal ;
	Animal lastAnimal ;
	
	public void enqueueAnimalShelter( String type , String Name) {
		Animal animal =  new Animal(type , Name);
		if( firstAnimal ==  null ) {
			firstAnimal = animal ;
			lastAnimal = animal;
		}else {
			lastAnimal.Next = animal ;
			lastAnimal = animal ;
		}
		
		
		
		}
	
	public Animal dequeAnimalShelter() {
		Animal animal =firstAnimal ;
		firstAnimal = animal.Next ;
		return animal ;
		
	}
	public Animal dequeAnimalShelter(String type) throws Exception {
	
		 try {
		Animal animal = firstAnimal ;
		Animal beforeAnimal = firstAnimal ;
		
		if(firstAnimal.Type == type) {
			firstAnimal = firstAnimal.Next ;
			return animal ;
		}else {
			animal = firstAnimal.Next ;
			
			while( animal.Type != type && animal.Next != null) {
				animal = animal.Next ;
				beforeAnimal = beforeAnimal.Next ;
				
			}
			
			if(animal.Type == type) {
				if(animal.Next != null) {
				beforeAnimal.Next = animal.Next ;
				return animal ;}else {
					beforeAnimal.Next =  null ;
					return animal ;
				}
				
			}else {
			
				Animal temporary = new Animal("NO ANIMAL" , "NO ANIMAL");
				
				return temporary ;
			}
			
		}
		 }catch(NullPointerException e) {
			throw new Exception();
		 }
		
	} 
	
	public void show() {
		Animal animal = firstAnimal ;
		while(animal.Next!= null) {
			System.out.println(animal.Name);
			animal =  animal.Next;
		}
	}
	
	public static void main(String args[]) throws Exception {
		
		AnimalShelter animalShelter = new AnimalShelter();
		
		animalShelter.enqueueAnimalShelter("DOG" , "ROCKY");
	
		animalShelter.enqueueAnimalShelter("DOG", "tom");
		animalShelter.enqueueAnimalShelter("DOG", "tomim");
		
		animalShelter.enqueueAnimalShelter("DOG", "paul");
		animalShelter.enqueueAnimalShelter("CAT", "hoovy");

		
		animalShelter.show();
	     System.out.println("here is the bought animal");
		System.out.println(animalShelter.dequeAnimalShelter("CAT").Name);
		System.out.println(animalShelter.dequeAnimalShelter("DOG").Name);
		System.out.println(animalShelter.dequeAnimalShelter("CAT").Name);
		System.out.println(animalShelter.dequeAnimalShelter().Name);
		System.out.println(animalShelter.dequeAnimalShelter().Name);
		System.out.println(animalShelter.dequeAnimalShelter().Name);
		System.out.println(animalShelter.dequeAnimalShelter().Name);
	}
	
}

