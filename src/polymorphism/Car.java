//Vehicle child/subclass
package polymorphism;

public class Car extends Vehicle{

	@Override
	public void go() { // void not return anything
		System.out.println("*The car begins mooving*");
		
	}
}
