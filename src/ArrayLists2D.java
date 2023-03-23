// 2D ArrayList = = a dynamic list of lists (list of separate list)
// You can change the size of these lists during runtime				
import java.util.*;

public class ArrayLists2D {
	
	public static void main (String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList(); // <what we want to store>
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		//System.out.println(bakeryList); // [pasta, garlic bread, donuts]
		//System.out.println(bakeryList.get(0)); // 0 = pasta
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchino");
		produceList.add("peppers");
		produceList.add("onions");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		
		//System.out.println(bakeryList); // [pasta, garlic bread, donuts]
		//System.out.println(bakeryList.get(0)); // 0 = pasta
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList); // [[pasta, garlic bread, donuts], [tomatoes, zucchino, peppers, onions], [soda, coffee]]
		System.out.println(groceryList.get(0)); // [pasta, garlic bread, donuts]
		System.out.println(groceryList.get(2).get((1))); // coffe ==> 3rt list (0,1,2) + 2nd second item
		
		
	}
}



