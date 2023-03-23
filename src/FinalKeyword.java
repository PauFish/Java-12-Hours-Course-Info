// final= if is declared final cannot be changed or updated


public class FinalKeyword {
	
	public static void main (String[] args) {
	
		double pi=3.14159;
		
		pi = 4;
		
		System.out.println(pi); // 4.0
		
		
		
		final double RAD=3.14159; // final variables always CAPITALICED
		
		//radius = 4; //Error can not be updated
		
		System.out.println(RAD); //3.14159
		
		}
	}




