package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
public static void main(String[] args) {
	

			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
		String four =JOptionPane.showInputDialog("Enter the number 4");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
		String six =JOptionPane.showInputDialog("Enter the number 6");
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			//JOptionPane.showMessageDialog(null, four+six);
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String five = JOptionPane.showInputDialog("type the numer 5");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			//JOptionPane.showMessageDialog(null, four+six+five);

			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int fourAsInt = Integer.parseInt(four);
			int sixAsInt = Integer.parseInt(six);
			// 7) Do the same for sixAsString. 
			int fiveAsInt = Integer.parseInt(five);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			JOptionPane.showMessageDialog(null, fourAsInt+sixAsInt+fiveAsInt);
			// int sixAsInt = Integer.parseInt(six);d you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
}}
