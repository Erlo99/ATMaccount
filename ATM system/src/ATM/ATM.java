package ATM;

import java.util.Scanner;

public class ATM {
	
	protected static int id = 1000;
	protected int accountId;
	protected int accountType;
	protected String firstName;
	protected String lastName;
	protected String password;
	protected String username;
	protected int balance;
	
	public boolean check(String username, String password) {
		if( checkData(username, password)) return true;
		else return false;
	}
	private boolean checkData(String username, String password) {
		if(this.password.equals(password) && this.username.contentEquals(username)) return true;
		else return false;
	}
	
	
	
	public void account() {
		int key;
		int amount;
		do {
		System.out.print("wellcome " + this.firstName + "\nBalance: " + this.balance + "$" +
				"\n0 - Deposit\n1 - withdraw\nOther - Logout\nPress key:");
		Scanner in = new Scanner(System.in);
		key = in.nextInt();
		switch(key) {
		case 1: { 
			System.out.print("How much do you want to withdraw?: ");
			amount =  in.nextInt();
			if((this.balance - amount)<0) System.out.println("not enough funds try again");
			else this.balance -= amount;

		} 
		case 0: {
			System.out.print("How much do you want to deposit?: ");
			amount =  in.nextInt();
			if(amount > 10000) System.out.println("Too much go to the bank for deposit!");
			else if(amount < 0) System.out.println("You can't withdraw here!");
			else this.balance += amount;
			
		}
		default: if(key != 0 && key != 1) break;
		}
		}while (1 == 1);
		
	}
}
