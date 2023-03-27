// static = modifier. A single copy of a variable/method is created and shared.
//			The class "owns" the static member

package StaticKeyword;

public class Main {
	
	public static void main (String[] args) {
		
		Friend friend1 = new Friend("Harpi");
		Friend friend2 = new Friend("Kashu");
		Friend friend3 = new Friend("Pawi");
		
		//System.out.println(Friend.numberOfFriends); //3  name of the class "Friend"+"Static member to access
		
		
		Friend.displayFriends(); //You have 3 friends
		
		
		}
	}




