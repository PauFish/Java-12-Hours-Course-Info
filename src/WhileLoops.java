
// While loop = execute a block of code as long as a it's condition remains true

import java.util.Scanner;

public class WhileLoops {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) { //if you hit enter will continue asking "Enter your name:"
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.print("Hello " + name + "\n" );
		
		
		/**************************************************************/
		// DO While loops
		
		String last = "";
		do { //always perform the code at least ones 
			System.out.print("Enter your last name: ");
			last = scanner.nextLine();
		}while(last.isBlank());
		
		System.out.print("Hello " + last);
		
		
		/*************************************************************/
		
		/*while(1==1) {
			System.out.println("Help, I'm stuck in a loop");
		}*/
		
	}
	

}
