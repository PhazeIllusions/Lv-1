import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class messing_Around extends MouseAdapter implements ActionListener {
	JFrame frame;
	JLabel label2;
	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want
	 * to get out of the static main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		messing_Around illusions = new messing_Around();
		illusions.createBook();
	}

	messing_Around() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.pack();
		label2 = loadImageFromComputer("556689-1113-2.jpg");

		frame.add(label2);
		frame.pack();
		frame.addMouseListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 1000);
		frame.pack();

	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	private void createBook() {
		// 2. make the frame visible
		// 3. set the size of the frame
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g.
		// "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		// 7. use the "loadImage..." methods below to initialize your JLabel
		// 8. add your JLabel to the frame
		// 9. call the pack() method on the frame
		// 10. add a mouse listener to your frame (hint: use *this*)
	}

	public void mousePressed(MouseEvent e) {
		if (e.getSource() == frame) {
			System.out.println("Clicked!");

			JLabel label = loadImageFromComputer("images.jpg");
			frame.add(label);
			frame.remove(label2);
			frame = new JFrame();
			frame.setVisible(true);
			frame.setSize(200, 200);
			frame.pack();
			label2 = loadImageFromComputer("556689-1113-2.jpg");

			frame.add(label2);
			frame.pack();
			frame.addMouseListener(this);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1000, 1000);
			frame.pack();
		}
		// 11. Print "clicked!" to the console when the mouse is pressed
		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
