import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SensitiveKeyboard implements KeyListener {
	JFrame frame;
	JPanel panel;
	public static void main(String[] args) {
		SensitiveKeyboard x = new SensitiveKeyboard();
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	SensitiveKeyboard() {
		panel = new JPanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		speak("Do do do do do do dooo do do doooo do do dooooo do do do do do do du du douuuu");
	

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
