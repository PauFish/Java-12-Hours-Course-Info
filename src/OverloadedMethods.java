// printf() = an optional method to control, format, and display text to the console window
//			  two arguments = format string + (object/variable/value)
//			  % [flags] [permision] [width] [conversion-character]


public class OverloadedMethods {
	
	public static void main (String[] args) {
		
		//System.out.printf("This is a format %d string ",123); //two arguments = format string + (object/variable/value)  %d is where the value will be shown 
		
		//Common datatipes
		int myInt = 50;
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Pau";
		double myDouble = 1000;
		
		
		//System.out.printf("%d",myInt); // %d = integer  = 50
		//System.out.printf("%b",myBoolean); // %b = boolean  = true
		//System.out.printf("%c",myChar); // %c = character = @
		//System.out.printf("%s",myString); // %s = string = Pau
		//System.out.printf("%f",myDouble); // %f = double = 1000
		
		/***************************/
		//[width]
		// Minimum number of character to be written as output
		// % [flags] [permision] [width] [conversion-character]
		//System.out.printf("Hello %10s",myString); // 10 spaces ==> Hello_________Pau (_)= space
		//System.out.printf("Hello %-10s",myString); // 10 spaces ==> Hello Pau______ (_)= space
		
		/****************************/
		//[precision]
		// sets number of digits of precision when aoutputting floating-point values
		//System.out.printf("You have this much money %f",myDouble); // 1000,000000
		//System.out.printf("You have this much money %.2f",myDouble); // 1000,00  .2==> 2 digits
		
		/****************************/
		//[flags]
		// adds an effect to autput based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		//System.out.printf("You have this much money %-20f",myDouble); // - : left-justify ==>1000,000000_________________ //(_)=space
		//System.out.printf("You have this much money %20f",myDouble); // - : right-justify ==>_________1000,000000
		//System.out.printf("You have this much money %+f",myDouble); // +1000,000000
		//System.out.printf("You have this much money %-f",myDouble); // -1000,000000 (first change double myDouble = -1000)
		//System.out.printf("You have this much money %020f",myDouble); // 0000000001000,000000
		System.out.printf("You have this much money %,f",myDouble); // 1.000,000000
		
		
		
		
		
		
	}
}





