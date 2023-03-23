//MathClass
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;
		
		double z = Math.max(x, y); 
		System.out.println(z); //max number is 3.14
		
		double p = Math.abs(y); 
		System.out.println(p); //absolute value of -10 is 10
		
		double u = 57.2;
		double q = Math.sqrt(u); 
		System.out.println(q); //"raiz cuadrada" square root of 57.2 = 7.56
		
		double r = Math.round(u); 
		System.out.println(r); //57.2 rounded is 57.0  "redondear" 
		
		double l = Math.ceil(u); 
		System.out.println(l); //57.2 Ceil will rounded UP always = 58.0 
		
		double f = Math.floor(u); 
		System.out.println(f); //57.2 Floor will rounded DOWN always = 57
		
		/*******************************************************/
		//Hypotenuse of a triangle
		
		double a;
		double b;
		double c; //Hypotenuse
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter side a: ");
		a = scanner.nextDouble();
		System.out.println("enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is : " +z);
		
		scanner.close();
		
		
	}
	

}
