//Random values, Use in videogames
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random(); //sudo random numbers, not 100% random
		
		int x = random.nextInt(6)+1; //limit size 6 (6 side dice) +1 because starts at 0 and i want from 1 to 6
		//double y = random.nextDouble(); // 0 to 1 (0.151515, 0.555)
		//boolean z = random.nextBoolean(); //true of false
		
		System.out.print(x);
		
	}
	

}
