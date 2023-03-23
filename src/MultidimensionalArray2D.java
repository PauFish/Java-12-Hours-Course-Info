// 2D arrays or multidimensional = an array of arrays
public class MultidimensionalArray2D {
	
	public static void main (String[] args) {
		
		
		
		
		String[][] bikes = new String[2][3]; // 2 rows 3 columns
		bikes[0][0]= "Harley";
		bikes[0][1]= "Corvete";
		bikes[0][2]= "Silverado";
		bikes[1][0]= "Mustang";
		bikes[1][1]= "Corvette";
		bikes[1][2]= "Silverado";
		
		for(int i=0; i<bikes.length;i++) {
			System.out.println(); // to jump cursor
			for(int j=0; j<bikes[i].length; j++) { //will continue if the array has something
				System.out.print(bikes[i][j]+" "); // bikes in row i column j
				/*  Harley Corvete Silverado 
					Mustang Corvette Silverado 
				*/	
		
		/*****************************************************/
				
		String [][] cars = { //array of rows and columns
						{"Camaro", "Corvette", "Silverado"}, //row 0
						{"Mustang", "Ranger", "f-150"},      //row 1
						{"Ferrari", "Lambo", "Tesla"}		 //row 2
			};		
		
		for(int k=0; k<cars.length;k++) {
			System.out.println(); // to jump cursor
			for(int l=0; l<cars[k].length; l++) { //will continue if the array has something
				System.out.print(cars[k][l]+" "); // bikes in row i column j
				
				/*  Camaro Corvette Silverado 
					Mustang Ranger f-150 
					Ferrari Lambo Tesla 
				*/
			}
		}
		
		
		
	}
	

		}
		
		}
	}




