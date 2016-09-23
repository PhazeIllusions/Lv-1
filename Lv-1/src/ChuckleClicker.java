import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChuckleClicker {
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;

	public static void main(String[] args) {
ChuckleClicker Click = new ChuckleClicker();
	}

	ChuckleClicker() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton();
		b2 = new JButton();
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
