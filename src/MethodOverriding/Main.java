//  Method overriding = Declaring a method in sub class, which is already present in parent class.
//						done so that a child class can give it own implementation
package MethodOverriding;

public class Main {
	
	public static void main (String[] args) {
		
		Animal animal = new Animal();
		animal.speak(); //The animal speaks
		
		
		Dog dog = new Dog();
		dog.speak();
		
		}
	}




