
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {
	String image = "www.buzzodd.com/wp-content/uploads/2014/05/7-Flat-Face.jpg";

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String image = "http://www.buzzodd.com/wp-content/uploads/2014/05/7-Flat-Face.jpg";
		// 2. create a variable of type "Component" that will hold your im
		Component comp;
		// 3. use the "createImage()" method below to initialize your Component
		comp = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String x = JOptionPane.showInputDialog(null, "what do you see in da face?");
		// 7. print "CORRECT" if the user gave the right answer
		if (x.equals( "potatoes")) {
			JOptionPane.showMessageDialog(null, "correct");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null,
					"incorrect, the answer was potatoes becoz he is Irish and Irsh  love potatoes");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window
		String image2 = "http://www.bajiroo.com/wp-content/uploads/2013/02/most-weird-funny-images-pictures-of-day-bajiroo-photo-gallery-picdump-10.jpg";
		// 12. pack the quiz window
		Component comp2;
		comp2 = createImage(image2);

		quizWindow.add(comp2);
		quizWindow.pack();
		// 13. ask another question
		String z = JOptionPane.showInputDialog(null, "what do you see in da photo?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (z.equals("small eyes")) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null,
					"incorrect, the answer was small eyes becoz he is asian and asans have small eyes");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
