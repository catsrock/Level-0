import javax.swing.JOptionPane;

public class agecount {public static void main(String[] args) {
	for (int i = 2002; i < 2017; i++) {
		System.out.println(i);
			}

String year=JOptionPane.showInputDialog("What year were you born?");
int a=Integer.parseInt(year);
for (int i = a; i < 2017; i++) {
	System.out.println(i);
	
}
}

}
