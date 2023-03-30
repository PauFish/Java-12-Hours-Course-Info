// Polymorphism =	Greek word for poly "many", morph "form"
//					The ability of an object to identify as more than one *data* type

// a car identify like a car and a vehicle at the same time
package polymorphism;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers =  {car,bicycle,boat}; //can't be car[] has to be he parent Vehicles "what they have in common"
		//Object[] racers =  {car,bicycle,boat}; //will work Object because all child objects are objects of the parent class, + some more changes
		
		
		for(Vehicle x : racers) { // xx= vehicle we are now working with. racers=name array 
			x.go();
					/**The car begins mooving*
					*The bicycle begins mooving*
					*The Boat begins mooving*/
		}
		
	}

}
