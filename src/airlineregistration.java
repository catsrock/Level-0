// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airlineregistration {public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("What is your first name?");
	String Name=JOptionPane.showInputDialog("What is your last name?");
	String destination=JOptionPane.showInputDialog("What is your destination?");
	String birthday=JOptionPane.showInputDialog("When is your birthday?");
	String gender=JOptionPane.showInputDialog("What gender?");
	JOptionPane.showMessageDialog(null, "LAST NAME / FIRST NAME (Birthday, M/F) Traveling to: " + Name+ ", "+name+", "+birthday+", "+gender+", "+destination);
	
}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/