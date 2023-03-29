package interfaces;

public class Fish implements Prey,Predator{   //a fish can be a prey and a predator

	@Override
	public void hunt() {
	
		System.out.println("this fish is hunting smaller fish");
		
	}

	@Override
	public void flee() {
		
		System.out.println("this fish is fleeing fron a larger fish");
	} 

}
