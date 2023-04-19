package in.atm;
import java.util.Scanner;

public class Menu {
	
	Transaction t= new Transaction();
	
	public void showMenu() {
		String name="Welcom To Menu";
		
		try {
			for(int i=0;i<name.length();i++) {
				System.out.print(name.charAt(i));
				Thread.sleep(35);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		System.out.println("1: Check your balance...!!");
		System.out.println("2: Deposit...!!");
		System.out.println("3: Withdraw...!!");
		System.out.println("4: Transfer...!!");
		System.out.println("5: Transaction History...!!");
		System.out.println("6: Exit from menu...");
		
		char option='\0';
		System.out.println("Enter option...");
		Scanner sc=new Scanner(System.in);
	
		
		do {
			option=sc.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case '1':System.out.print("Balance=");
					t.getbalance();
			break;
			
			case '2':System.out.println("Enter an amount to deposit!!");
				int amount=sc.nextInt();
				t.deposit(amount);
			break;
			
			case '3':System.out.println("Enter an amount to withdraw!!");
			int amount1=sc.nextInt();
			t.withdraw(amount1);
			break;
			
			case '4':System.out.println("Enter an amount to transfer!!");
			int amount2=sc.nextInt();
			t.transfer(amount2);
			break;
			
			case '5':t.getTransactionHistory();;
			break;
			
			case '6':System.out.println("Thank you");
			break;
			
			default:System.out.println("Invalid option!! please enter valid option.");
			}
		}while(option !='6');
			System.out.println("Thank you...!");
}
}
