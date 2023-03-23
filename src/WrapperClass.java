// wrapper class= provides a way to use primitive data types as reference data types
//				  reference data types contain useful methods     
//				  can be with collections (ex.ArrayList)

//primitive(fast) //wrapper(slow)
/* boolean		     Boolean
 * char			     Character
 * int			     Integer
 * double		     Double
 */

// autoboxing = the automatic conversion that Java compiler makes between the primitive types and their corresponding wrapper class
// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive




public class WrapperClass {
	
	public static void main (String[] args) {
		//wrappers autoboxing
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Pau";
		//a. all reference methods will pop
		
		//unboxing
		if (a==true) {
			System.out.println("This is true");
		}
		
		}
	}




