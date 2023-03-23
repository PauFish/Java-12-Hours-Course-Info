
// for-each (enhance for loop) =  traversing technique to iterate throgh the elements in an array/collection
//			   					  less steps, more readable	
//			   					  but is less flexible	

import java.util.ArrayList;

public class ForLoops {
	
	public static void main (String[] args) {
		
		//String[] animals = {"cat","dog","rat","bird"};
		//for(String i : animals) { // for every string index in animals array
		//	System.out.println(); // cat dog rat bird}
		
		ArrayList<String> animals = new ArrayList<String>();		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		for(String i : animals) { // for every string index in animals array
			System.out.println(i); // cat dog rat bird}
		
		
	}
	}	

}
