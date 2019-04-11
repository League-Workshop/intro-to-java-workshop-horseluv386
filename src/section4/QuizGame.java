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

	String ans2 = JOptionPane.showInputDialog("What was the official first state of the United States?");

		if(ans2.equalsIgnoreCase("Delaware")) {
			score++;
		}
	String ans3 = JOptionPane.showInputDialog("Calculate 13 x 15?");

		if(ans3.equalsIgnoreCase("195")) {
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
		
	if(score>=4) {
	 JOptionPane.showMessageDialog(null, "Your score is " + score + "! Good job!");
	}
	else {JOptionPane.showMessageDialog(null, "Your score is " + score + ". Better luck next time!");
	}
	}
}
