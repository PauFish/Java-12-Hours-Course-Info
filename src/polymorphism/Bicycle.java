//Vehicle child/subclass
package polymorphism;

public class Bicycle extends Vehicle{

	@Override
	public void go() { // void not return anything
		System.out.println("*The bicycle begins mooving*");
	}
}
