package StacksAndQueues.Exercise3_7;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalShelter {

	private LinkedList<Animal> animals = new LinkedList<>();
	
	public void enqueue(Animal animal) {
		animals.add(animal);
	}
	
	public Animal dequeueAny() {
		if ( animals.isEmpty() ) throw new RuntimeException("No animals in Shelter");
		return animals.removeFirst();
	}
	
	private Animal get(String type) {
		Animal current;
		Iterator<Animal> it = animals.iterator();
		while ( it.hasNext() ) {
			current = it.next();
			if ( current.type.equals(type) ) {
				it.remove();
				return current;
			}
		}
		
		return null;
	}
	
	public Animal dequeueDog() {
		Animal dog = get("Dog");
		if ( dog == null ) 
			throw new RuntimeException("No dog in shelter");
		
		return dog;
	}
	
	public Animal dequeueCat() {
		Animal cat = get("Cat");
		if ( cat == null )
			throw new RuntimeException("No cat in shelter");
		
		return cat;
	}
}
