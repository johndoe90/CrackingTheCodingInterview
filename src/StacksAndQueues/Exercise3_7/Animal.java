package StacksAndQueues.Exercise3_7;

public class Animal {
	
	public String name;
	public String type;
	
	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}
}
