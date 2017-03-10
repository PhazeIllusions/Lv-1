import java.applet.AudioClip;
import java.sql.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Make a drawButtons method that takes a random number as a parameter. It should make a GUI like this, but the “mole!” location is random.
//	[Hint: set the size of the frame rather than packing it.]
public class WhackAMole {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton moleButton;
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

public static void main(String[] args){
	WhackAMole x = new WhackAMole();
	
	int numOfButtons = 100;
	x.drawButtons(  new Random().nextInt(numOfButtons ));
}
private void drawButtons(int random){
	frame.add(panel);
	
	
	
	
		for (int i = 0; i < 100; i++) {
		JButton b1 = new JButton();
		panel.add(b1);
		if(i == random){
		b1.setText("Mole!");
		
	}
	}
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(800, 400);
	
	

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
	
	}
