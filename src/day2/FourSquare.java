package day2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot gage = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		gage.setSpeed(10);
		// 5. Set the pen width to 5
		gage.setPenWidth(10);
		// 6. Do steps #7 to #8 four times...
		int i = 0;
		while (i < 4) {
			// 7. Set the pen color to random
			gage.setPenColor(Color.pink);
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			gage.turn(90);
		i++;
		}
		
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		

		gage.move(100);
		gage.turn(90);
		gage.move(100);
		gage.turn(90);
		gage.move(100);
		gage.turn(90);
		gage.move(100);
		gage.turn(90);
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
