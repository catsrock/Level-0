import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class Dizzy_Tortoise {


	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.


 // 1. Use the dance method to make the Tortoise spin.
		String tortoise=JOptionPane.showInputDialog("From a scale of 1-10, how dizzy do you want the tortoise?");
	int num=Integer.parseInt(tortoise);
		dance(num);
	
	
	

	}


	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
			
		}
	}
	}


