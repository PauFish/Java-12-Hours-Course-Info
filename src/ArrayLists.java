// ArrayList = a resizable array.
//				  Elements can be added and removed after compilation phase  
//				  store reference data types
import java.util.ArrayList;

public class ArrayLists {
	
	public static void main (String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();  // Integer, Characters...
		
		food.add("pizza");
		food.add("burger");
		food.add("hotdog");
		
		food.set(0, "sushi"); // sushi, burger, hotdog
		food.remove(2); // sushi, burger
		food.clear(); // empty all the array
		
		for(int i=0; i<food.size(); i++){  // normaly you will use .lenght but in arraylist we use .size
		
			System.out.println(food.get(i));
		}
	}
}



