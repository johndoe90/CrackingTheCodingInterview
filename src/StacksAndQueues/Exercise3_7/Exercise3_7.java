package StacksAndQueues.Exercise3_7;

public class Exercise3_7 {

	public static void main(String[] args) {
		AnimalShelter shelter = new AnimalShelter();
		shelter.enqueue(new Animal("Cat", "Pia"));
		shelter.enqueue(new Animal("Dog", "Rufus"));
		shelter.enqueue(new Animal("Dog", "Thomas"));
		
		System.out.println(shelter.dequeueDog());
		System.out.println(shelter.dequeueAny());
		System.out.println(shelter.dequeueDog());
	}
}
