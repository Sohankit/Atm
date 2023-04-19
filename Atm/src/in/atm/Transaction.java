package in.atm;

public class Transaction{
	public int balance=50000;
	int accountHistory;
	
	public void getbalance() {
		System.out.println(balance);
	
		
	}
	
	public void deposit(int amount) {
		if(amount!=0) {
			balance+=amount;
			accountHistory+=amount;
			System.out.println("Transaction succesful...!");
			
		}
	}
	
	public void withdraw(int amount) {
		if(amount<=balance) {
			balance-=amount;
			accountHistory-=amount;
			System.out.println("Transaction is succesfull...!");
			
		}
		else {
			System.out.println("Insufficeint balance amount...");
		
		}
	}
	
	
	public void transfer(int amount) {
		if(amount>=balance) {
			balance-=amount;
			accountHistory-=amount;
			System.out.println("Transaction is succesfull...!");
			
		}
		else {
			System.out.println("Insufficeint balance amount...");
			
		}
		
	}
	
	
	 void getTransactionHistory() {
		System.out.println("Transaction History...!");
		if(accountHistory>0) {
			System.out.println("Deposited: "+accountHistory);
		}
		else if(accountHistory<0) {
			System.out.println("Withdraw: "+Math.abs(accountHistory));
		}
		else if(accountHistory<0) {
			System.out.println("Transfer: "+Math.abs(accountHistory));
		}
		else {
			System.out.println("No Transaction Found...!");
		}
	}
	
}
