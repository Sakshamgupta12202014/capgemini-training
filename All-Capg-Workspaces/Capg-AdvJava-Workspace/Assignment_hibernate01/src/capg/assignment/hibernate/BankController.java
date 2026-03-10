package capg.assignment.hibernate;

import java.util.Scanner;

public class BankController {
	public static void main(String []args) {
		try {
			
			int terminate;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("1. Create a new Account\n2. Show Account Balance\n3. Deposited Money\n4. Withdraw Money\n5. Fund transfer\n6. Print tranbsactions");
				System.out.print("Enter your choice : ");
				
				int choice;
				choice = sc.nextInt();
				
				switch(choice) {
					case 1 : {
						// create a new account
						System.out.print("Enter account number: ");
						int account_no = sc.nextInt();
						
						System.out.print("Enter the account holder name : ");
						String customer_name = sc.nextLine();
						
						System.out.print("Enter the account holder's mobile number : ");
						long mobile_number = sc.nextLong();
						
						System.out.print("Enter the opening account balance : ");
						double balance = sc.nextDouble();
						
						
					}
					
					case 2 : {
						
					}
					
					case 3 : {
						
					}
					
					case 4 : {
						
					}
					
					case 5 : {
						
					}
					
					case 6 : {
						
					}
				}
				
				System.out.print("Do you want to continue with the session : ");
				terminate = sc.nextInt();
			}while(terminate != 1);
		} catch (Exception e) {
			System.err.println("Exception occurred : " + e);
		}
	}
}		
