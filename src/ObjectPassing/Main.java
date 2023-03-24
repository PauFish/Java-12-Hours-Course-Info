package ObjectPassing;

public class Main {
	
	public static void main (String[] args) {
		
		
		Garage garage = new Garage();
		
		Car car1 = new Car("bmw");
		Car car2 = new Car("tesla");
		
		//send a car to the garage
		garage.park(car1);
		garage.park(car2);
		
}
}
