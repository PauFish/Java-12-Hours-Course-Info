// overloaded constructors = multiple constructors within a class with the same name,
//			but have different parameters.
//			name + parameters = signature





public class Main {
	
	public static void main (String[] args) {
		
		
		Pizza pizza = new Pizza("thicc crust","tomato","bufala","fungi");//Instantiate an instance of pizza class "create pizza object"
		//Pizza pizza = new Pizza("thicc crust","tomato","bufala"); //thicc crust tomato bufala NULL
		//Pizza pizza = new Pizza("thicc crust","tomato"); //thicc crust tomato NULL NULL
		//Pizza pizza = new Pizza("thicc crust"); //thicc crust NULL NULL NULL
		//Pizza pizza = new Pizza(); //NULL NULL NULL NULL
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread); //access the bread variable of pizza object
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		}
	}




