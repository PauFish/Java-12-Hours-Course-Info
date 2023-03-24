//Constructor = special method that is called when an object is instantiated (created)
//				Allow to construct objects that have varying attributes 
package constructor;

public class Main {
	
	public static void main (String[] args) {
		
		Human human1 = new Human("Kasia",33,58); //this give the ability to create different objects with different attributes
		Human human2 = new Human("Pau",39,68);
		
		System.out.println(human1.name); //name object + attribute
		System.out.println(human2.name);
		
		human2.eat();//call the method inside human EAT   ==> "Pau" is eating
		human1.drink();//call the method inside human DRINK   ==> "Kasia" is drinking
		}
	}




