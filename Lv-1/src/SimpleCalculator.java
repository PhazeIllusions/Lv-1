
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("add");
	JButton sub = new JButton("subtract");
	JButton mult = new JButton("multiply");
	JButton div = new JButton("divide");
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);



	public static void main(String[] args) {
		SimpleCalculator x = new SimpleCalculator();
		x.createUI();
	}
	private void createUI() {
		frame.add(panel);
		panel.add(tf1);
		panel.add(tf2);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mult.addMouseListener(this);
		div.addMouseListener(this);
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			
		}
		else if (e.getSource() == sub) {
			
		}
		else if (e.getSource() == div) {
			
		}
		else if (e.getSource() == mult) {
			tf1 * tf2;
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}