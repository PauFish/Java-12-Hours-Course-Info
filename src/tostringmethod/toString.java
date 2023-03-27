package tostringmethod;
// toString() = special method that all objects inherit
//				that returns a string that "textually represents" an object.
//				can be used both implicitly and explicitly




public class toString {
	
	public static void main (String[] args) {
		
		Car car = new Car();
		
		System.out.println(car.model); //display attribute model
		System.out.println(car.make);
		System.out.println(car.color);
		System.out.println(car.year);
		
		System.out.println(car.toString()); // ==> Car@4517d9a3  == Address of Car in the memories !!ThE SaMe!!
		System.out.println(car); // ==> Car@4517d9a3  == Address of Car in the memories
		
		/*******/
		System.out.println(car.toString()); // ==> mustang ford red 2021
		System.out.println(car); // ==> mustang ford red 2021
	
		
		}
	
	}




