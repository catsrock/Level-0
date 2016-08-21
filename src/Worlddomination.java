import javax.swing.JOptionPane;

public class Worlddomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String domination=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.

if (domination.equals("yes")) { JOptionPane.showMessageDialog(null, "You will rule the world.");
	
}
if (domination.equals("no")) {JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
	
}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
