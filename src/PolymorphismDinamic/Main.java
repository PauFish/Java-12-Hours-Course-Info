//Dynamic Polymorhism 
// Polimorphism= many shapes/forms
//dynamic = after compilation (during runtime)

//ex. A corvette is a: corvette, and a carm and a vehicle, and an object

package PolymorphismDinamic;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Animal animal; 
		//we want an animal of the animal class but now we don't not that tipe "user will tell*dog,Cat..*"
		
		System.out.println("what animal do you whant=");
		System.out.print("1=dog, 2=Cat");
		int choice = scanner.nextInt();


		if(choice==1) {
			animal = new Dog(); //Construct this animal like a Dog
			animal.speak(); //Overridden methos
		}
		else if(choice==2) {
				animal = new Cat(); //Construct this animal like a Cat
				animal.speak(); //Overridden methos
		}
		else {
			animal = new Animal();
			System.out.println("that choice was invalid");
			animal.speak();
		}
	}

}
