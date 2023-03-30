package fileWrite;

import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		
	try {
		FileWriter writer = new FileWriter("poem.txt");
		writer.write("En un lugar muy lejano de la galaxia \nStar wars");
		writer.append("\n*A poem by me*");
		writer.close();
		System.out.println("ya");
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
}
