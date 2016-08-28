import org.jointheleague.graphical.robot.Robot;

public class Robotinitials {public static void main(String[] args) {
	Robot tom= new Robot();
tom.setSpeed(5);
	tom.penDown();
	tom.move(200);
	tom.move(-200);
	tom.turn(-90);
	tom.move(100);
	tom.penUp();
	tom.move(-200);
	tom.turn(90); 
	tom.penDown();
	tom.move(200);
	tom.move(-200);
	tom.turn(90);
	tom.move(100);
}

}
