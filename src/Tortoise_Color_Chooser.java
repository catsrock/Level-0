// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import java.awt.AWTException;
import java.awt.Color;


import org.jointheleague.graphical.robot.Robot;

public class Tortoise_Color_Chooser {
	public static void main(String[] args) throws Exception {
		Robot tom = new Robot();
		

		//3. ask the user what color they would like the tortoise to draw
		
		//4. use an if/else statement to set the pen color that the user requested

//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	//1. make the tortoise draw a shape (this will take more than one line of code)

		tom.penDown();
		tom.setPenWidth(10);
		for (int i = 0; i < 15; i++) {
				String color=JOptionPane.showInputDialog("What color do you want the robot to draw? You have three options: red, yellow, and blue");
				Color userColor = Color.getColor(color);
				if(color.equals(null)){
					tom.setRandomPenColor();
				}
		//else if(color.equals("yellow")){
		//	tom.setPenColor(Color.yellow);
		//}
				else{
					tom.setPenColor(userColor);
				}
		
				tom.setSpeed(10);
				for (int j = 0; j < 101; j++) {
					tom.move(j);
					tom.turn(360/9);
				}
		
		}
	
		
		
		




	}
}


