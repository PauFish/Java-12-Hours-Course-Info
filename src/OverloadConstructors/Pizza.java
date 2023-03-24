package OverloadConstructors;

public class Pizza {

	//variables
	String bread;
	String sauce;	
	String cheese;
	String topping;
	
	Pizza(){ //pizza constructor (setup)
	
	}
	Pizza(String bread){ //pizza constructor (setup)
		this.bread = bread;
	}
	
	Pizza(String bread,String sauce){ //pizza constructor (setup)
		this.bread = bread;
		this.sauce = sauce;
	}
	
	Pizza(String bread,String sauce,String cheese){ //pizza constructor (setup)
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	Pizza(String bread,String sauce,String cheese, String topping){ //pizza constructor (setup)
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
	
	
	
	
	
	
	
	
	
	
	
}
