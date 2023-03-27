package MethodOverriding;

public class Dog extends Animal{
	
	@Override  //good practice
	void speak() { // overriding Method
		System.out.println("the dog goes *Bark*");
	}
}
