//  Inheritance =    the process where one class acquire the attributes and methods of another
package Inheritance;

public class Main {
	
	public static void main (String[] args) {
		
	
		Car car = new Car();
		//car.go(); //This vehicle is moving
		
		Bicycle bike = new Bicycle();
		//bike.stop(); //This vehicle is stopped
		
		System.out.println(car.speed); // 0.0
		System.out.println(car.doors); // 5
		System.out.println(bike.pedals); // 2
		
		}
	}




