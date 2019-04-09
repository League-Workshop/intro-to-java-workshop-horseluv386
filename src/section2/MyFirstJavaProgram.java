package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
	Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(35);
		for(int i = 0; i < 4; i++) {
			r2d2.move(100);
			r2d2.turn(90);
		}		
	r2d2.penUp();
		r2d2.sparkle();

		}
			
		
		
	}

