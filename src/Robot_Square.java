import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Square {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
Robot bob=new Robot();
		// 3. Put the robot's pen down

		// 6. Make the robot move as fast as possible

		// 5. Do everything below here 4 times

		// 		2. Move your robot 200 pixels
bob.penDown();
bob.setSpeed(100);
for (int i = 0; i < 3; i++) {
	bob.move(200);
bob.turn(360/3);
}
bob.penUp();
bob.moveTo(100, 200);
bob.penDown();
bob.setPenColor(Color.BLUE);
for (int i = 0; i < 4; i++) {
	bob.move(4*i);
bob.turn(360/4);
}


		// 		4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
