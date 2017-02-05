import java.net.URI;

import javax.swing.JOptionPane;

public class Soundtrack_to_Life {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		for (int i = 0; i < 3; i++) {
			
		
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Feeling Moody", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Mad", "Sad", "Stop" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.

		System.out.println(userMood);
		String sadVideo="https://www.youtube.com/watch?v=NguIpRFLM4M";
		String angryVideo="http://bit.ly/video-for-angry";
		String happyVideo="http://bit.ly/video-for-happy";
		int sad=2;
		int mad=1;
		int happy=0;
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if(userMood==sad){
	playVideo(sadVideo);
}

else if(userMood==mad){
	playVideo(angryVideo);
}

else if(userMood==happy){
	playVideo(happyVideo);
}
else{
	System.exit(0);
}
		// 4. Play different songs for other moods.
}
		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/

