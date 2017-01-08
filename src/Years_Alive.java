import javax.swing.JOptionPane;

public class Years_Alive {
public static void main(String[] args) {
	String age=JOptionPane.showInputDialog("How old are you?");
	int a=Integer.parseInt(age);
	for (int i = 0; i <a+2; i++) {
		if (2017-i==2017-a-1) {
			System.out.print(2017-a-1);}
		else {System.out.print(2017-i+", ");}
		
		
	}
}
}
