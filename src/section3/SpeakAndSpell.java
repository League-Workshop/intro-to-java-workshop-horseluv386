package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Mississippi");
		String answer = JOptionPane.showInputDialog("Spell the word you heard!");

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"
if(answer.equalsIgnoreCase("mississippi")) {
	speak("You are correct!");
}
		// 4. Otherwise say "wrong"
else {
	speak("Are you sure about that?... mississippi");
	String answer1_5 = JOptionPane.showInputDialog("Spell the word you heard...better this time!");
	if(answer1_5.equalsIgnoreCase("mississippi")) {
		speak("You are correct!");
	} 
	else {
		speak("You're an absolute failure");
	}
}
		// 5. repeat the process for other words
	speak("grateful");
String answer2 = JOptionPane.showInputDialog("Spell the word you heard!");
	if(answer2.equalsIgnoreCase("grateful")) {
		speak("You are correct!");
	}
			// 4. Otherwise say "wrong"
	else {
		speak("Are you sure about that?... grateful");
		String answer2_5 = JOptionPane.showInputDialog("Spell the word you heard...better this time!");
		if(answer2_5.equalsIgnoreCase("grateful")) {
			speak("You are correct!");
		} 
		else {
			speak("You're an absolute failure");
		}
	}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


