package superKeyword;

public class Hero extends Person{

	String power;
	
	Hero(String name, int age, String power){
		
		super(name,age); // super refers to the parent class we know "Person"
		this.power=power;
		}
	
	/*********************************/
	
	public String toString(){
		return super.toString()+this.power;
		}
}
