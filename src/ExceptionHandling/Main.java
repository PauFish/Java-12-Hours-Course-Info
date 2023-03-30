// Exception = an event that occurs during the execution 
//				of a program that disrupts the normal flow of intruccions
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in); //out will solve finnaly problem
		 
		try {
		
		
		System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();
		
		System.out.println("Enter a whole number to divide: ");
		int y = scanner.nextInt();
		
		int z = x/y; // error if 5/0 will be solved with try and catch exception TRY
		
		System.out.println("result: " + z);
		}
		catch(ArithmeticException e){ //error type "0=zero"
			System.out.println("You can't devide by zero!");
		}
		catch(InputMismatchException e){ //error type "pizza"
			System.out.println("Please enter only numbers");
		}
		catch(Exception e) {//all error types but not good practices, or use at the end
			System.out.println("Somerthing went wrong");
			
		}
		finally { //this will always print
			scanner.close();
		}
	}

}
