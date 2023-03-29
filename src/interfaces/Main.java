// Interface = a template that can be applied to a class.
//			   similar to inheritance, but specifies what a class has/must do.	
//			   classes can apply more than one interface, inheritance is limited to 1 super class
package interfaces;

public class Main {

	public static void main(String[] args) {
		

	Rabbit rabbit = new Rabbit();
	rabbit.flee(); //*The rabbit is fleeing*
		
	Hawk hawk = new Hawk();
	hawk.hunt(); //*The hawk is hunting*
	
	
	Fish fish = new Fish();
	fish.flee();
	fish.hunt();
	
	
	}

	

}
