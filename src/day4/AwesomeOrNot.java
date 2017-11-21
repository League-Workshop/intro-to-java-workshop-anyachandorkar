package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random x = new Random();
int y= x.nextInt(4);
	// 3. Print out this variable
System.out.println(y);
	// 4. Get the user to enter something that they think is awesome
String awe = JOptionPane.showInputDialog(null, "What is something you think is awesome?");
	// 5. If the random number is 0
if (y==0) {
	// -- tell the user whatever they entered is awesome!
JOptionPane.showMessageDialog(null, awe + " is awesome!");
}
	// 6. If the random number is 1
if (y==1) {
	// -- tell the user whatever they entered is ok.
JOptionPane.showMessageDialog(null, awe + " is okay");
}
	// 7. If the random number is 2
if (y==2); {
	// -- tell the user whatever they entered is boring.
JOptionPane.showMessageDialog(null, awe + " is boring");
}
	// 8. If the random number is 3
if (y==3) {
	JOptionPane.showMessageDialog(null, awe + " is beyond legendary");
}

}}


