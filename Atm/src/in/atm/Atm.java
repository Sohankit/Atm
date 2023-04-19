package in.atm;
import java.util.Scanner;

public class Atm {
	Menu m= new Menu();
	
	int id=1234;
	int pass=1234;
	int uid;
	int upass;
	
	
	public void input() {
		System.out.println();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter id...!");
		uid=sc.nextInt();
		
		System.out.println("Please enter password...!");
		upass=sc.nextInt();
	}
	
	public void verify() throws InvalidUserCredentialException {
		if((id==uid) && (pass==upass)){
			m.showMenu();
		}
		else {
			InvalidUserCredentialException iuce= new InvalidUserCredentialException("Enter user id and password is incorrect");
			iuce.getMessage();
			throw iuce;
		}
	}

}
