// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class xgeek {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
String Dylan=JOptionPane.showInputDialog("What is your name?");
		// 2. Ask the user to enter a name. Store their answer in a variable.
if(Dylan.equalsIgnoreCase("Dylan")){
	JOptionPane.showMessageDialog(null, "Your superpower is invisibility.");
}
else if(Dylan.equalsIgnoreCase("Dasha")){
		JOptionPane.showMessageDialog(null, "Your superpower is the ability to clone.");
	}
		
else if(Dylan.equalsIgnoreCase( "Miller")){
			JOptionPane.showMessageDialog(null, "Your superpower is telepathy.");
		}
else 	if(Dylan.equalsIgnoreCase("Keith")){
			JOptionPane.showMessageDialog(null, "Your superpower is being an amazing coding teacher.");
		}
else	if(Dylan.equalsIgnoreCase("Shiva")){
			JOptionPane.showMessageDialog(null, "Your superpower is control over your brother.");
		}
else	if(Dylan.equalsIgnoreCase("Eshaan")){
	JOptionPane.showMessageDialog(null, "Your superpower is being awesome at Clash of Clans.");
}
else if(Dylan.equalsIgnoreCase("Mr. Steven")){
	JOptionPane.showMessageDialog(null, "Your superpower is super strength.");
}
else if(Dylan.equalsIgnoreCase("Joanne")){
	JOptionPane.showMessageDialog(null, "Your superpower is intelligence.");
}
else {JOptionPane.showMessageDialog(null, "I don't remember you!");}
		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}
