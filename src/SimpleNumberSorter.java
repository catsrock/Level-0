import javax.swing.JOptionPane;

public class SimpleNumberSorter {
	public static void main(String[] args) {
		String one= JOptionPane.showInputDialog("Think of one number.");
String two=JOptionPane.showInputDialog("Think of another number.");
String three=JOptionPane.showInputDialog("Think of another number.");
int first=Integer.parseInt(one);
int second=Integer.parseInt(two);
int third=Integer.parseInt(three);

if(first>second && first>third){
	if(second>third){
		System.out.println(third+", "+second+", "+first);
	}
	else{
		System.out.println(second+", "+third+", "+first);
	}
}

 if(first<second && third<second){
	if(third>first){
		System.out.println(first+", "+third+", "+second);
	}
	else{
		System.out.println(third+", "+first+", "+second);
	}
}

 if(first<third && second<third){
if(first>second){
	System.out.println(second+", "+first+", "+third);
}
else{
	System.out.println(first+", "+second+", "+third);
}
	}
 
 if(first>second && first>third){
		if(second>third){
			System.out.println(first+", "+second+", "+third);
		}
		else{
			System.out.println(first+", "+third+", "+second);
		}
	}

	 if(first<second && third<second){
		if(third>first){
			System.out.println(second+", "+third+", "+first);
		}
		else{
			System.out.println(second+", "+first+", "+third);
		}
	}

	 if(first<third && second<third){
	if(first>second){
		System.out.println(third+", "+first+", "+second);
	}
	else{
		System.out.println(third+", "+second+", "+first);
	}
		}
}





	

	public SimpleNumberSorter() {
		// TODO Auto-generated constructor stub
	}

}
