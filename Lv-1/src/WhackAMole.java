import java.applet.AudioClip;
import java.sql.Date;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

//Make a drawButtons method that takes a random number as a parameter. It should make a GUI like this, but the “mole!” location is random.
//	[Hint: set the size of the frame rather than packing it.]
public class WhackAMole {
//
//
//
//If they click on a button other than “mole!”, use this speak() method to call them a dork. 
void speak(String words) {
try {
	words = "dork";
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}


//
//
//Dispose of the frame and draw the buttons anew.
//
////After they’ve whacked 10 moles, call this endGame() method.
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date(molesWhacked);
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

////Progressively insult them if they hit something other than the mole! button.
////If they get click an empty button twice, call them an idiot.
////If they click an empty button three times, call them a moron.
////If they click an empty button four times, call them a complete waste of atoms.
////[Use a switch statement for extra amazingness.]
////
//Call this playSound() method when they hit a mole.
private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	void drawButtons (int rand) {		
	for (int i = 0; i < 1; i++) {
		
	}	
	}
}