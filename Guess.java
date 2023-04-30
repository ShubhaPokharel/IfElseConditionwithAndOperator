import java.util.Scanner;

class Guess{
	public static void main(String[] args){

	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter username");
	String name = s.next();

	String password = s.next();
	System.out.println("Enter password");

	if(name.equals("hello1234") && password.equals("Love12345")){

	System.out.println("Correct");
	}
    else{
System.out.println("WRONG");
    }
	}
}