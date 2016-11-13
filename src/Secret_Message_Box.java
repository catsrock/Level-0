// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;


/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */


public class Secret_Message_Box {public static void main(String[] args) {
		// 1. Set the passcode in a String variable
	String passcode="yellow";
	String username="Unicorns";
	// 2. Using a pop-up, ask for a secret message and store it in a variable
String jerry=JOptionPane.showInputDialog("What is the secret message?");

	// 3. Ask your friend for the passcode and store it in a variable
String tom=JOptionPane.showInputDialog("What is the passcode?");
String name=JOptionPane.showInputDialog("What is the username?");
	// 4. If the passcode matches, show the secret message
if(tom.equalsIgnoreCase(passcode)){
	if(name.equalsIgnoreCase(username)){
	JOptionPane.showMessageDialog(null, jerry);
	
}}
else{
	JOptionPane.showMessageDialog(null, "INTRUDER!!");
}
	// 5. If the passcode does not match, pop-up "INTRUDER!!"

	
	
	
}


	// 0. Make a main method and put steps 1-5 inside it
	


	// [optional] 6. Have your friend also enter a username, and make sure it is correct before releasing the secret message.


}




