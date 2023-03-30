//Vehicle child/subclass
package polymorphism;

public class Boat extends Vehicle{
	
	@Override
	public void go() { // void not return anything
		System.out.println("*The Boat begins mooving*");
	}
}
