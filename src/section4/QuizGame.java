package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
	String ans = JOptionPane.showInputDialog("What is the capital of Hungary?");

		if(ans.equalsIgnoreCase("Budapest")) {
			score++;
		}

	String ans2 = JOptionPane.showInputDialog("What is the capital of Hungary?");

		if(ans2.equalsIgnoreCase("Budapest")) {
			score++;
		}
	String ans3 = JOptionPane.showInputDialog("What is the capital of Hungary?");

		if(ans3.equalsIgnoreCase("Budapest")) {
			score++;
		}
	String ans4 = JOptionPane.showInputDialog("What is the capital of Hungary?");

		if(ans4.equalsIgnoreCase("Budapest")) {
			score++;
		}
	String ans5 = JOptionPane.showInputDialog("What is the capital of Hungary?");

		if(ans5.equalsIgnoreCase("Budapest")) {
			score++;
		}
		JOptionPane.showMessageDialog(null, "Congratulations! Your score is " + score + "!");
	}
}
