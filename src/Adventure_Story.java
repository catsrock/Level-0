import javax.swing.JOptionPane;

public class Adventure_Story {public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Luke decides to take a walk in the forest. \nUpon arriving, there are two roads he can take. Each one has a sign describing what each road leads to. \n"
			+ "The left road has a sign saying that it leads to an empty cliff where hundreds of graves lie. No one has ventured near for years, for fear of death.\n"
			+ "The right road has a sign saying that it leads to a family of violent wildlife. No one else has lived there for several years.\n");
	String answer=JOptionPane.showInputDialog("Which road should he take, left or right?");
	if(answer.equals("left")){
		JOptionPane.showMessageDialog(null, "Luke takes the left road and reaches a flat, desert-like landscape with hundreds of rocks shaped like graves. He trips over a rock and falls down a small slope where more rocks lie. \n He gets lost and wanders until he finds a house and a pond. Luke is dehydrated and comes closer. \n The house has a threatening note tacked on the door, and the pond has strange ripples across the surface.\n");
String ans2=JOptionPane.showInputDialog("Which one should Luke take if he wants water, the house or the pond?");
if(ans2.equals("house")){	
	JOptionPane.showMessageDialog(null, "Luke takes the note off the door and throws it in the water. A creature snaps the note up and he hurries into the house.\n In the house, a person is watering his plants. The person points to two doors in the house, and tells Luke that the left one is a door that could have gold. The right one is a door that could lead to food, water, and shelter.");
String ans3=JOptionPane.showInputDialog("Which door should he take, left or right?");
if(ans3.equals("left")){
	JOptionPane.showMessageDialog(null, "Luke opens the left door and finds a painted rock with directions on how to get home.");
}

}
else{
	JOptionPane.showMessageDialog(null, "Luke dives into the water of the pond and finds an underwater bunker. He opens the door up and finds a bunch of supplies, but no water. There are strange arrows pointing in different directions. One is green, the other is red.");
	String ans4=JOptionPane.showInputDialog("Which arrow should he take, green or red?");
}
		
	}
	else{
		JOptionPane.showMessageDialog(null, "Luke takes the right road and arrives at a loud, packed beach surrounded by houses. The family there is currently having a violent pillow fight.");
	}
}

}
