
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalfarm {

	animalfarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
String animal=JOptionPane.showInputDialog("Out of these four animals, which one do you want? You have the choice of a cow, a duck, a wolf, and a llama.");
		/* 2. Make it so that the user can keep entering new animals. */
	if(animal.equals("cow")){
		playMoo();
	
	}
	if(animal.equals("duck")){
		playQuack();
	}
	if(animal.equals("wolf")){
		playWoof();
	}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new animalfarm();
	}

}



