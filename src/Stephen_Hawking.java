import java.io.IOException;

import javax.swing.JOptionPane;

public class Stephen_Hawking {
	
	public static void main(String[] words) {
	
String answer=JOptionPane.showInputDialog("How high should I count?");
	int num=Integer.parseInt(answer);
	for (int i = 1; i < num+1; i++) {
		if(i%3==0 && i%5==0){
			speak("FizzBuzz");
		}
		else if(i%3==0){
			speak("Fizz");}
		
		else if(i%5==0){
			speak("Buzz");
		}
		else{
			speak(Integer.toString(i));
		}
		
	}
	JOptionPane.showMessageDialog(null, "Game over!");

}
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014