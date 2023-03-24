package constructor;

public class Human {
	//attributes
	String name;
	int age;
	double weight;
	
	//constructor
	Human(String name, int age, double weight){ //constructor
		this.name = name; //this=(human) attribute to define
		this.age = age;
		this.weight = weight;
	}
		
	//methods
		void eat() {
			System.out.println(this.name+" is eating");
		}
		void drink() {
			System.out.println(this.name+" is drinking");	
		
	}
}
