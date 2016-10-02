
 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class birthdayreminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 22nd";
		String dadsBirthday = "April 27th";
		String myBirthday = "July 30th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday=JOptionPane.showInputDialog("Do you want my mom's birthday, my dad's, or mine?");
		// 3. Print out what the user typed
		JOptionPane.showMessageDialog(null, birthday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(birthday.equals("mom")){
			JOptionPane.showMessageDialog(null, "July 22nd.");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(birthday.equals("dad")){
			JOptionPane.showMessageDialog(null, "April 27th");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(birthday.equals("yours")){
			JOptionPane.showMessageDialog(null, "July 30th");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else{
			JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday!");
			
		}
	} 
}