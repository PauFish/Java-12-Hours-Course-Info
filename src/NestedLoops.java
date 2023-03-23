

// nested loops = a loop inside a loop
import java.util.Scanner;

public class NestedLoops {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows:");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns:");
		columns = scanner.nextInt();
		System.out.println("Enter symbol of columns:");
		symbol = scanner.next(); // next will store the next token that we enter until press enter or space
		
		
		for(int i=1; i<=rows; i++) { 
			System.out.println(); // this will move the cursor to the next row of characters
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol); //no printLN
				
				/*  $$$$$
					$$$$$
					$$$$$
					$$$$$
				*/	
			}
		}
		
		
		
		
	}
	

}

