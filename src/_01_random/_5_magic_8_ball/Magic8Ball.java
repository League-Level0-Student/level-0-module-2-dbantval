//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number
	//    into this variable using "new Random().nextInt(4)"
	int number = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(number);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("enter a question");
	// 5. If the random number is 0
if (number == 0) {
	JOptionPane.showMessageDialog(null, "yes");
}
	// -- tell the user "Yes"
if (number == 1) {
	JOptionPane.showMessageDialog(null, "no");
}
	// 6. If the random number is 1
if (number == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask google");
}
	// -- tell the user "No"
if (number == 3) {
	JOptionPane.showMessageDialog(null, "im not shure");
}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
}}
	// -- write your own answer


