package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot walle=new Robot();
		walle.setSpeed(1000);
		walle.penDown();
		walle.setPenWidth(20);
		for(int i=0; i<4; i++) {
			walle.move(200);
			walle.turn(90);
		}
		}
}
