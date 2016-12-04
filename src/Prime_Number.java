import javax.swing.JOptionPane;

public class Prime_Number {public static void main(String[] args) {
	
	for (int i = 0; i < 10; i++) {
	String prime=JOptionPane.showInputDialog("Enter a number.");	
	int num=Integer.parseInt(prime);
	if (isPrime(num)) {
		JOptionPane.showMessageDialog(null, "Your number is prime.");
	}
	else{
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
	}
	}
}

private static boolean isPrime(int num) {
	// TODO Auto-generated method stub
	if (num < 2) {
		return false;
	}
	else if(num == 2 || num== 3){
		return true;
	}
	else{
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num% i==0) {
				return false;
			}
		}
	}
	return true;
	
}

}
