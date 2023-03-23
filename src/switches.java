//Switch = statement that allows a variable to be tested for equality against a list of values
//if you use lots of "else if" better use Switch
public class switches {

	public static void main(String[] args) {
		
		String day = "Friday";
		
		switch(day) {
		case "Monday": System.out.println("It is Monday!"); // is day = to Monday? no, continue
		break;
		case "Tuesday": System.out.println("It is Tuesday!");
		break;
		case "Wednesday": System.out.println("It is Wednesday!");
		break;
		case "Thursday": System.out.println("It is Thursday!");
		break;
		case "Friday": System.out.println("It is Friday!");
		break;
		case "Saturday": System.out.println("It is Saturday!");
		break;
		case "Sunday": System.out.println("It is Sunday!");
		break;
		default: System.out.println("That is not a day");
		
		}
	
	}
	

}
