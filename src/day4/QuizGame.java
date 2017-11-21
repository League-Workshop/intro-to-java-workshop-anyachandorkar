package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		
		// 2.  Ask the user a question 
		String ask = JOptionPane.showInputDialog(null, "What is Dwight's last name in The Office?");
		
		// 3.  Use an if statement to check if their answer is correct
		if (ask.equalsIgnoreCase("Shrute")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			userScore = 1;
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect!");
		}
		// 4.  if the user's answer is correct
	
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your total score is " + userScore);
	}
}
