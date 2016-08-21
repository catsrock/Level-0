import javax.swing.JOptionPane;

public class Riddle {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int myscore = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("I have a riddle for you. You will always find me in the past. I can be created in the present, but the future can never taint me. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the
		// score by one
		if (riddle.equals("history")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			myscore++;

		} else {
			JOptionPane.showMessageDialog(null, "Wrong. It's history.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, " This is your score. " + myscore);
	}
}
