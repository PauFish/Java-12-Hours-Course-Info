// file = An abstract representation of file and directory pathnames


package FileClass;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("c:\\Users\\Pauykasia\\Desktop\\pajaros.png"); //inside the computer
		//File file = new File("secret_message.odt"); //inside the project
		
		if(file.exists()) {
			System.out.println("that file exists");
			
			//location finders
			System.out.println(file.getPath()); //location where file is
			System.out.println(file.getAbsolutePath()); //absolute= inside my computer
			System.out.println(file.isFile()); // returns true/false ==> false=folder
			
			file.delete(); //delete the file "F5" if doesn't work
		}
		else {
			System.out.println("that file doesn't exists");
		}
	}

}
