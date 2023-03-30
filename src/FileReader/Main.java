// fileReader = read the contents of a file as a stream of charters. One by one read() 
//				returns an int value which contains the byte value 
//				when read() returns -1, there is no more data to read

package FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[]args) {
		try {
			FileReader reader = new FileReader("poem.txt");
			int data = reader.read();
			while(data!=-1) { // when read() returns -1, there is no more data to read
				System.out.print((char)data); //write in the console
				data= reader.read(); // continue reading
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
