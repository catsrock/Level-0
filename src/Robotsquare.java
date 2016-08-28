
import org.jointheleague.graphical.robot.Robot;

public class Robotsquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
Robot tom= new Robot();
		// 3. Put the robot's pen down
tom.penDown();
		// 6. Make the robot move as fast as possible

		// 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	tom.move(200);
	tom.turn(90);
}
		// 		2. Move your robot 200 pixels

		// 		4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
