package ATM;


import java.util.ArrayList;

import java.util.Scanner;

public class ATMapp {
	
	
	
	public static void main(String[] args) {
		
		
		
		ArrayList<ATM> person = new ArrayList<>();
		int n = -1;
		int todo;
		
		do {
		System.out.print("Hello welcome to my ATM manager \n \n0 - register\n1 - Login\nOther Number - Quit\nDo you want to Login or Register: ");
		Scanner in = new Scanner(System.in);
		todo = in.nextInt();
		switch(todo) {
		
		case 1:{
			do {
				System.out.print("Username: ");
				String user = in.next();
				System.out.print("Password: ");
				String pass = in.next();
				
				
			for(int i=0;i<person.size();i++) {
				if(person.get(i).check(user, pass)) {
					System.out.println("Logged in");
					n = 1;
					person.get(i).account();
					break;
					
				} 
			}
				if(n != 1) {
				System.out.println("Wrong Login or Password. \nTry Again Press 1\nQuit press 0");
				n = in.nextInt();
				if(n == 0) { n = -1;  break;}
				else n = -1; 
				}
			}while(n<0);
			
			}
		
		case  0: {
			person.add(new ATMRegister(todo));
			
		} 
		default:{
			if(todo != 0 && todo != 1) {
			System.out.println("Bye");
			System.exit(0);
			}
		} 
		}
		}while (todo != 1);
			
	}
	
}
