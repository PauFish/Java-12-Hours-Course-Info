// Encapsuation = attributes of a class will be hidden or private. Can be accessed only through methods (getter & setters)
//				  You should attributes private if you don't have a reason to make public/protected
package encapsulation;

public class Main {
	
	public static void main (String[] args) {
		
		
		Car car = new Car("Chevy","Camaro",2021);
		
		// will not work because is private System.out.println(car.make);
		
		car.setYear(2023);// change year with a setter method
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		
	}
}



