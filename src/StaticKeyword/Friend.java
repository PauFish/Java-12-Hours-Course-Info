package StaticKeyword;

public class Friend {

	String name;
	static int numberOfFriends;
	
	Friend(String name){//constructor
		this.name=name;
		numberOfFriends++; //+1 every time is used
		
		
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+" friends");
	}
}
