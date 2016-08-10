
//Hua Xia
//CIS 35A 
//Assignment 9
//Due Date: June 20
//Submit Date: June 20

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Driver {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Object[] options = { "Continue", "Exit" };
		Object[] option1 = { "Close" };
		// The User Interface of selection
		int n = JOptionPane.showOptionDialog(frame,
				"This is Disney Cottages Check In Program\n" + "Please enter your selection",
				"Disney Cottages Check In", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
				options, options[1]);
		// if user presses yes, proceed to program
		if (n == JOptionPane.YES_OPTION) {
			DisneyCottage size = new DisneyCottage(); // Program call
			size.setSize(400, 300);
			size.setVisible(true);
		}
		// the error selection
		else if (n == JOptionPane.NO_OPTION) {
			System.out.println("GoodBye!");
			@SuppressWarnings("unused")
			int x = JOptionPane.showOptionDialog(frame, "Farwell" + " Thanks for using!", "Disney Cottages Check In",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[0]);
		}
		// exit the driver class
	}

}