package section3;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("Please enter an adjective...");
		// Get the user to enter a type of liquid
		String liq = JOptionPane.showInputDialog("Please enter a type of liquid...");
		// Get the user to enter a body part
		String bod = JOptionPane.showInputDialog("Please enter a body part...");
		// Get the user to enter a verb
		String ver = JOptionPane.showInputDialog("Please enter a verb...");
		// Get the user to enter a place
		String pla = JOptionPane.showInputDialog("Please enter a place...");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adj + " during the day, so cross the river at night. \n Piranhas are attracted to fresh " + liq + " and will most likely take \n a bite out of your " + bod + " if you "	+ ver + ". Whatever you do, if you \n have an open wound, try to find another way to get back to " + pla + ". Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

