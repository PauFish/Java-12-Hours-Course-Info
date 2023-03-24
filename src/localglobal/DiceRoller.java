package localglobal;

import java.util.Random;


public class DiceRoller{
	
	//local=	declare inside a method
	//			visible only to that method
/*	DiceRoller(){ //constructor
		Random random = new Random();
		int number = 0;
		roll(random,number);
	}
	//method
	void roll(Random random, int number) {
		number = random.nextInt(6)+1; //+1 because we get numbers from 0 to 5
		System.out.println(number);
	}
*/	
	
	
	
	//global=	declared outside a method, but within a class
	//			visible to all parts of a class
	
	
		Random random; //outside then is global
		int number;   //outside then is global
		
	DiceRoller(){ //constructor
		random = new Random();
		roll();
	}
	//method
	void roll() {
		number = random.nextInt(6)+1; //+1 because we get numbers from 0 to 5
		System.out.println(number);
	}
	
	
}
