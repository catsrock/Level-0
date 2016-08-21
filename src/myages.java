import javax.swing.JOptionPane;

public class myages {public static void main(String[] args) {
	String myAge=JOptionPane.showInputDialog("How old are you?");
	int age=Integer.parseInt(myAge);
	for (int i = 1; i < age; i++) {
		System.out.println(i);
	
	}
	
}

}
