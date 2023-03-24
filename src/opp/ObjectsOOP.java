package opp;
// object = an instance of a class that may contain attributes(characteristics that object have) and methods(different actions that object can perform)
//		example: (phone, desk. computer, coffee cup)
//  	Instantiate = create a object

public class ObjectsOOP {
	
	public static void main (String[] args) {
		
		Car myCar1 = new Car(); //myCar has now all the attributes and methods of the class Car
		Car myCar2= new Car();
		
		System.out.println(myCar1.model); //display attribute model
		System.out.println(myCar1.make);
		System.out.println(myCar1.color);
		System.out.println(); //black 
		System.out.println(myCar2.model); //same myCar1, to be different we need a constructor
		System.out.println(myCar2.make);
		System.out.println(myCar2.color);
		System.out.println(); //black 
		
		myCar1.drive(); //Call the drive method of myCar1 "object" == object myCar1 + method drive
		myCar2.brake();
		System.out.println(); //black 
		
		Bike mybike = new Bike();
		System.out.println(mybike.model);
		mybike.rive();
		}
	}




