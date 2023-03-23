import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.print("I love pizza\n"); // \n= new line
		System.out.println("it's really good!");
		System.out.println("\t and i love apples"); // \t= tab
		System.out.print("\"I love apples\""); // \"sdfsf\" Quotes
		System.out.println("Are really \\ good!"); //  \\=\
		
		/************************************************/
		//variables
		
		long a; //declaration
		a= 32151515165165165L; // L at the end "long"
		int b = 123; // initialization
		float q = 3.14f; // "f" float
		boolean s = true;
		char symbol = '@'; //symbols char
		String fullname = "Pau";
		System.out.println("Hello "+fullname);
		
		/************************************************/
		//switch/swap content
		
		String x = "water";
		String y = "Tang";
		String temp; 
		
		// with the help of the variable temp
		temp= x; // pass "water" to temp and now X is empty
		x=y;  // fill X with Y "tang"
		y=temp; // fill Y with "water"
		
		System.out.println("X: "+x);
		System.out.println("Y: "+y);
		
		/************************************************/
		//reading user imputs
		//import java.utilScanner at the top always
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name? ");
		String name = scanner.nextLine();
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine(); //cleans the scanner, use when you have two in a row "nextline" 
		System.out.println("What is your favorite food");
		String food = scanner.nextLine();
		
		
		
		System.out.println("hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("i love "+food);
		
		/************************************************/
		//Expresions
		
		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		
		//operators = + - * / %
		int friends = 10; // was int friends but change it in line 87
		friends = friends +1;
		System.out.println(friends); //11
		friends = friends *2;
		System.out.println(friends); //22
		
		friends = friends %3;
		System.out.println(friends); //remainder of a division "resto de la division" = 1 
		
		friends++; // increment friends = friends +1
		System.out.println(friends);  // 1(remainder)+1(++)= 2
		friends--; // decrement friends = friends -1
		System.out.println(friends);  // 2+1(--)= 1
		friends = friends + 9;
		System.out.println(friends); // 10   i just need a big number
		friends = friends / 3;
		System.out.println(friends); // 3   truncate any decimal
		friends = friends + 7;
		System.out.println(friends); // 10   i just need a 10
		
		double friendsDouble = (double) friends / 3; // first convert  int friends to double friends line 67
		System.out.println(friendsDouble); // 3   truncate any decimal
		
		
		
	}
	
	//This is a commnet
	
	/*
	 * this
	 * is
	 * a
	 * comment
	 */
}