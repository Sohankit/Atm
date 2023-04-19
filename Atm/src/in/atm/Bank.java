package in.atm;

public class Bank {
	
	public void initiate() {
		Atm atm= new Atm();
	try {
		
		atm.input();
		atm.verify();
		
	}catch(InvalidUserCredentialException e) {
		try {
			
			atm.input();
			atm.verify();
			
		}catch(InvalidUserCredentialException e1) {
			try {
				
				atm.input();
				atm.verify();
				
			}catch(InvalidUserCredentialException e2) {
				System.out.println("Your card has been blocked...");
				System.exit(0);
			}
		}
		
	}
}
}
