// Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class Change_Calculator {

	public static void main(String[] args) {
		String nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		int money = Integer.parseInt(nickel);

		String dime = JOptionPane.showInputDialog("How many dimes do you have?");
		int stuff = Integer.parseInt(dime);

		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int something = Integer.parseInt(quarters);

		double total = 0.05 * money + 0.1 * stuff + 0.25 * something;
		System.out.println("Your total is $" + total + "!");
		JOptionPane.showMessageDialog(null, "Your sandwich is waiting at the bottom of your trash can.");
		// Ask the user how many nickels they have

		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

