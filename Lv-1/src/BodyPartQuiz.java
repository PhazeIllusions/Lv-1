import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "ssssssfawyawfawfsfwyfasyvsaduvasduvasduvawduavdausvdausdasudvasudvaiusvduawvdjahVdjhvaWgdvFACdhaFWDctAWFdytAVWjdvAGFV.jpg";
	String secondImage = "/Users/league/Desktop/Lv-1/Lv-1/awdawsdsssssssssssssssssss.jpg";
	String thirdImage = "/Users/league/Desktop/Lv-1/Lv-1/awdawdawdawdawdadawdawdawdawdawd.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		window.setSize(100, 100);
		// Make an int variable to hold the score.
		int score = 0;
		// Ask the user who this person is and store their answer
		String x = JOptionPane.showInputDialog(null, "Who is this?");
		// If they got the answer right:
		if (x.equals("Bustin Jieber")) {
JOptionPane.showMessageDialog(null, "Correct, Maybe...."
		+ "");
score += 1;
showNextImage();
		}
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong
else{
	JOptionPane.showMessageDialog(null, "you messed up");
	showNextImage();
}
		window.setSize(67, 102);
		String y = JOptionPane.showInputDialog(null, "Who is this?");
		// If they got the answer right:
		if (x.equals("a girl")) {
JOptionPane.showMessageDialog(null, "Correct, Maybe...."
		+ "");
score += 1;
showNextImage();

		}
		
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong
else{
	showNextImage();
	JOptionPane.showMessageDialog(null, "you messed up");
}
		String z = JOptionPane.showInputDialog(null, "Who is this?");
		// If they got the answer right:
		if (x.equals("Jacob Satrooius")) {
JOptionPane.showMessageDialog(null, "Correct, Maybe...."
		
		+ "");
score += 1;
showNextImage();
		}
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong
else{
	JOptionPane.showMessageDialog(null, "you messed up");
	showNextImage();
}
		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
		JOptionPane.showMessageDialog(null, score);
	}
	

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
