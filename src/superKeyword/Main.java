//  Super = keyword refers to the superclass (parent) of an object, is very similar to the "this" ketword
package superKeyword;

public class Main {
	
	public static void main (String[] args) {
		
		
	
		Hero hero1= new Hero("Batman",42,"$$$$");	
		Hero hero2= new Hero("Superman",43,"everything");
		
		System.out.println(hero1.name);
		System.out.println(hero1.age);
		System.out.println(hero1.power);
		System.out.println();
		System.out.println(hero2.toString());
		
		
		}
	}




