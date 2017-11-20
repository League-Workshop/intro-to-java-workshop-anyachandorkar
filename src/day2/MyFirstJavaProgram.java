package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot dwight = new Robot();
	dwight.penDown();
	dwight.setPenColor(Color.magenta);
	dwight.setPenWidth(10);
	dwight.sparkle();
	dwight.miniaturize();
	dwight.move(50);
		dwight.turn(-90);
		dwight.move(25);
		dwight.turn(360);
	
	}
}
