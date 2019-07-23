package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot hayden = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		hayden.setSpeed(100);
		// 5. Set the pen width to 5
		hayden.setPenWidth(5);
		hayden.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...

		// 7. Set the pen color to random
		for (int i = 0; i < 4; i++) {
			hayden.setRandomPenColor();

			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			hayden.turn(90);
		}
	}

	void drawSquare() {

		/* 3. Fill in the code to draw a square inside the method below. */

		for (int i = 0; i < 4; i++) {
			hayden.move(200);
			hayden.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
