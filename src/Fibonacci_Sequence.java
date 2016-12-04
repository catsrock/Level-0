import javax.swing.JOptionPane;

public class Fibonacci_Sequence {public static void main(String[] args) {
int num=0;
int num2=0;
		System.out.println(num+num);
		System.out.println(num+num2);
		for (int i = 0; i < 12; i++) {
if(num==0){
	System.out.println(1);
	num=1;
}
else{
	System.out.println(num+num2);
	int f=num+num2;
	num2=num;
	num=f;
}
	



}
	}


}


