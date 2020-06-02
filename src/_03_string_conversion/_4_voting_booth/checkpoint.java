package _03_string_conversion._4_voting_booth;

import java.util.Random;

import javax.swing.JOptionPane;

public class checkpoint {
public static void main(String[] args) {
	int num = 0;
	Random ran = new Random();
	num=ran.nextInt(1000);
	System.out.println( num);
	num =ran.nextInt(( 1000 + 1));
	System.out.println(num);
	num =ran.nextInt(( 900 + 1));
String nintynine = JOptionPane.showInputDialog("type the number 99");
String sixtyfour = JOptionPane.showInputDialog("type the number 64");

}
}