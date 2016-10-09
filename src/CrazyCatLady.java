import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String cats=JOptionPane.showInputDialog("How many cats do you have?");
String URL="https://www.youtube.com/watch?v=tntOCGkgt98";
String Frog="https://www.youtube.com/watch?v=SKRgktzRvZ0";
// 2. Convert their answer into an int
int num=Integer.parseInt(cats);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
if(num>3){
	JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
}
		// 4. If they have 3 or less, call the method below to show them a cat video
else if(num<=3 && num >=1){
	playVideo(URL);
}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
else if(num==0){
	playVideo(Frog);
}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
