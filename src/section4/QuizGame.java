package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int number = (0);
Integer.max
		String number2 = JOptionPane.showInputDialog("What is 7*9?");
		if (number2.equalsIgnoreCase("63")) {
			JOptionPane.showMessageDialog(null, "Correct! +1");
			number++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!, +0");
			number = number + 0;
		}
		String number3 = JOptionPane.showInputDialog("What is 4!");
		if (number3.equalsIgnoreCase("24")) {
			JOptionPane.showMessageDialog(null, "Correct! +1");
			number++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong!, +0");
			number = number + 0;
		}
		String number4 = JOptionPane.showInputDialog("What is the square root of 36?");
		if (number4.equalsIgnoreCase("6")) {
			JOptionPane.showMessageDialog(null, "Correct! +1");
			number++;
		} else {
			JOptionPane.showConfirmDialog(null, "Wrong!, +0");
			number = number + 0;
		}

		JOptionPane.showMessageDialog(null, number + ", Good score!");

	}
}
