package main;
import in.atm.*;

public class Main {

	public static void main(String[] args) {
		Bank b= new Bank();
		String name="Welcome To XYZ Bank...";
		
		try {
			for(int i=0;i<name.length();i++) {
				System.out.print(name.charAt(i));
				Thread.sleep(20);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		b.initiate();
		

	}

}
