// String = a reference data type that can store one or more characters
//          reference data types access to useful methods
public class StringMethods {
	
	public static void main (String[] args) {
		
		String name = "Pau";
		
		//boolean result = name.equals("Pau"); //returns true or false "boolean"
		//boolean result = name.equalsIgnoreCase("pau"); //not case sensitive returns True
		
		//int results = name.length(); // string lenght = 3 ===> 1P 2a 3u
		//System.out.println(results); //Return true
		
		//char result = name.charAt(0); // 0P 1a 2u  finds the character in the position (0)
		//System.out.println(result);
		
		//int result = name.indexOf("a"); // fins index number of a character, "P"=0 "a"=1 "u"=2
		//System.out.println(result);
		
		//boolean result=name.isEmpty(); //will return False
		//System.out.println(result);
		
		//String result = name.toUpperCase(); // PAU
		//String result = name.toLowerCase(); // pau
		
		//String result = name.trim(); // "   Hola   " ===> "Hola"
		
		String result = name.replace('a','o'); //replace oldChar to newChar ===> Pou
		
		System.out.println(result);
		}
	}




