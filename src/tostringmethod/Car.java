package tostringmethod;

public class Car {

	//variables
	String make = "ford";
	String model = "mustang";
	String color = "red";
	int year = 2021;
	
	
	/********/
	
	public String toString(){//no void, string because will return a String
		
		//String myString = make + "\n"+model+"\n"+color+"\n"+year;
		//return myString;
	
		return make + "\n"+model+"\n"+color+"\n"+year; //same but 1 line, will return all the attributes of our car
		//that returns a string that "textually represents" an object. ==> ford mustang red 2021
		
		
	}
}
