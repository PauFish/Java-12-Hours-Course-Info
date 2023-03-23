
// Array = used to store multiple values in a single variable
// arrays start by 0 always

public class Arrays {
	
	public static void main (String[] args) {
		
		String [] cars = {"Camaro", "Corvette", "Tesla", "BMW"}; //element 0,1,2,3  //datatipe has to be the same string, int...
		cars[0] = "Mustang"; //position 0 will be Mustang and not Camaro
		System.out.println(cars[0]);
		
		/******************************/
		
		String [] bikes = new String[3];  // bikes will be a array of 3 elements 0,1,2
		bikes[0]= "Harley";
		bikes[1]= "Honda";
		bikes[2]= "Kawasaki";
		System.out.println(bikes[2]);
		
		/******************************/
		
		for(int i=0;i<bikes.length; i++) {  //will display all the elements on bikes array
			System.out.println(bikes[i]);
		}
		
	}
	

}






