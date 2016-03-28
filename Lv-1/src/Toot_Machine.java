import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Toot_Machine implements ActionListener{
	String z = ".wav";
	String x = "2.wav";
	String w = "3.wav";
	JFrame frame;
	JPanel panel;
	JButton button;
	public static void main(String[] args) {
		Toot_Machine x = new Toot_Machine();
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
		
	}

	Toot_Machine() {
		
		panel = new JPanel();
		frame = new JFrame();
		button = new JButton();
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
playSound(z);
playSound(x);
playSound(w);
		}
	}
}
