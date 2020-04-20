package ATM;


import java.util.Scanner;

public class ATMRegister extends ATM{
		
		
		public ATMRegister(int bal) {
		
			this.firstName = setFirstName();
			this.lastName = setLastName();
			this.accountType = setAccountType();
			this.password = setPassword();
			this.accountId = this.accountType * 10000 + id;
			this.username = Integer.toString(accountId);
			this.balance = bal;
			String accType;
			if(accountType == 1) accType = "Bussiness";
			else accType = "Individual";
				
			id++;
			System.out.println("Account Created!!");
			System.out.println("Name: " + firstName + " " + lastName +
					"\nAccount Type: " + accType + 
					"\nUsername: " + username +
					"\nPassword: " + password +
					"\nBalance: " + balance + "$");
		}
		
		
		
		private String setFirstName() {
			System.out.print("Enter First Name:");
			Scanner in = new Scanner(System.in);
			
			return in.nextLine();
		}

		private String setLastName() {
			System.out.print("Enter Last Name:");
			Scanner in = new Scanner(System.in);
			
			return in.nextLine();
		}
		
		private int setAccountType() {
			System.out.print("Account type\n 1 - Bussiness\n 2 - Individual\nEnter Number :");
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			if (number == 1 || number == 2) {
				
				
				return number;
			}
			do {
				System.out.print("Incorrect Account Type Pick 1 or 2:");	
				number = in.nextInt();
			}while( number != 1 && number != 2);
			
			return number;
		}
		
		private String setPassword() {
			System.out.println("Set Password (length min. 8):");
			Scanner in = new Scanner(System.in);
			String pass = in.nextLine();
			if (pass.length() > 1) {
				
				
				return pass; 
			}
			do {
				System.out.println("Password Too short:");
				pass = in.nextLine();
				
			}while ( pass.length()<7);
			
			return pass;
			
			}
		
		
		
}
