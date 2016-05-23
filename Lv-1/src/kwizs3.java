import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class kwizs3 implements ActionListener{
	JFrame frame;
	JButton button1;
	JButton button2;
	JLabel label;
	JTextField textfield;
	JPanel panel;
	
	public static void main(String[] args) {
kwizs3 x = new kwizs3();

	}

	kwizs3() {
frame = new JFrame();
button1 = new JButton();
button2 =  new JButton();
label = new JLabel();
textfield = new JTextField(2);
panel = new JPanel();

frame.add(panel);
panel.add(button1);
panel.add(button2);
panel.add(label);
panel.add(textfield);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(1000, 1000);
label.setText("What is fresh when it is Hot?");
button1.setText("Submit");
button2.setText("Hint");
button2.addActionListener(this);
button1.addActionListener(this);



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(button2 == e.getSource()){
			System.out.println("It contains Gluten in pure form");
		}
		if(button1 == e.getSource()){
			String x = textfield.getText();
			if (x == "Bread"){
				System.out.println("Correct");
				
			}
		}
		
		}
	}

