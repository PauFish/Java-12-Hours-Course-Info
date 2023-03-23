
//Popups => GUI Graphical User Interface

import javax.swing.JOptionPane;

public class GUI {
	
	public static void main (String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name); // defauls a string
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); //have to convert string to int
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm")); //have to convert string to int
		JOptionPane.showConfirmDialog(null, "You are "+height+" cm height"); // showConfirmDialog "yes & no & cancel"
		
		
	}
	

}
