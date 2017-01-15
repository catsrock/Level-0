import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
	String happy=JOptionPane.showInputDialog("Are you happy?");
	if(happy.equals("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else{
		String question=JOptionPane.showInputDialog("Do you want to be happy?");
		if(question.equals("yes")){
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else if(question.equals("no")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
}
}
