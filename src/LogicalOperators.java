// Logical operators = used to connect two or more expressions
// && = (AND) both conditions true.   || = (OR) either condition must be true.  ! = (NOT) reverse boolean value of a condition

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
	
		//&& statement
		int temp = 31;
		
		if(temp>30)
		{
			System.out.println("It is hot outside");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		
		/********************************************/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to exit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("Continue playing");
		}
		
		/***** ! not ***/
		
		System.out.println("You are playing a Videogame! Press X or x to exit");
		String response2 = scanner.next();
		
		if(!response2.equals("x") && !response2.equals("X")) {
			System.out.println("Continue playing");
		}
		else {
			System.out.println("Exit the game");
		}
		
		
		
		
		
		
			
		
		
		
	
	}
	

}
