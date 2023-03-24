package ArrayOfObjects;


public class arrayobjects {
	
	public static void main (String[] args) {
		
		//Regular Arrays
		int[] numbers = new int[3];
		char[] characters = new char[4];
		String[] strings = new String [5];
	
		/*******************************/
		//array of objects
		
		Food[] refrigerator = new Food[3];// arry that can hold some objects
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("hotdog");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		//System.out.println(refrigerator[0]); // ArrayOfObjects.Food@4517d9a3
		System.out.println(refrigerator[0].name);  // pizza
		System.out.println(refrigerator[1].name);  // burger
		System.out.println(refrigerator[2].name);  // hotdog
	}
	
	    /*************************************************/
	  	//same but different, changing the order and less code
	/*
		Food food1 = new Food("pizza");
		Food food2 = new Food("burger");
		Food food3 = new Food("hotdog");
		
		Food[] refrigerator = {food1,food2,food3};
		
		System.out.println(refrigerator[0].name);  // pizza
		System.out.println(refrigerator[1].name);  // burger
		System.out.println(refrigerator[2].name);  // hotdog
		}
	*/	

}




