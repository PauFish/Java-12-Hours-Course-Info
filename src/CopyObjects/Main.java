package CopyObjects;



public class Main {

	public static void main(String[] args) {
		/*
			Car car1 = new Car("Chevy","Camaro",2021);
		 *  Car car2 = new Car("Ford","Mustang",2022);
		
		//copy car 2 like car 1
		// NO car2 = car1 because car2 will only be a copy of the address of car 1 CopyObjects.Car@4517d9a3
		
		
		
		car2.copy(car1); //CopyObjects.Car@4517d9a3  CopyObjects.Car@372f7a8d Perfect 2 addresses
		*/
		
		
		/****************************/
		
		
		/* when we instanciate the car instead of after the fact
		 * Create a COPY CONTRUCTOR */
		Car car1 = new Car("Chevy","Camaro",2021);
		Car car2 = new Car(car1); //in the constructor we will pass car1 like an argument and make a copy 
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());

	}

}
