package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot kevin = new Robot();
		// 5. Set your robot's pen to the down position
		kevin.penDown();
		// 3. Set the robot to go at max speed (10)
		kevin.setSpeed(10);
		// 4. Do the following (steps 6-8) 75 times
		int i=0;
		while (i<75) {
			System.out.print(i);
			i= i+1;
		
			// 7. Change the pen color to random
		kevin.setRandomPenColor();
		
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
		kevin.move(5*i);

			
			// 2. Turn the robot 1/7 of 360 degrees to the right\
		kevin.turn(360/7);
		
			// 8. Set the pen width to i
			kevin.setPenWidth(i);
		}
			}
}
