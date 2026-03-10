package com.capg.assessment.controller;

import java.util.Scanner;

import com.capg.assesment.service.BankService;

public class BankController {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        try {
            boolean flag = true;

            while (flag) {
                System.out.println("\n--- Bank Application Menu ---");
                System.out.println("1. Create Account");
                System.out.println("2. Show Account Balance");
                System.out.println("3. Deposit Amount");
                System.out.println("4. Withdraw Amount");
                System.out.println("5. Fund Transfer");
                System.out.println("6. Print Transactions");
                System.out.println("7. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    // 1. Create Account
                    case 1:
                        try {
                            sc.nextLine();
                            System.out.print("Enter Customer Name: ");
                            String name = sc.nextLine();
                            
                            System.out.print("Enter Account number: ");
                            int acNum = sc.nextInt();
                            
                            System.out.print("Enter Mobile number: ");
                            long mobileNum = sc.nextLong();

                            System.out.print("Enter Initial Balance: ");
                            double balance = sc.nextDouble();
                            
                            

                            BankService service = new BankService();
                            boolean status = service.createAccount(name,acNum,mobileNum,balance);
                            if(status) {
                            	System.out.println("Account created successfully.");
                            }
                            else {
                            	System.out.println("Failed to create Account.");
                            }
                            
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    // 2. Show Balance
                    case 2:
                        try {
                            System.out.print("Enter Account Number: ");
                            int accNo = sc.nextInt();

                            BankService service = new BankService();
                            double bal = service.showBalance(accNo);

                            System.out.println("Available Balance: " + bal);
                        } 
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    // 3. Deposit
                    case 3:
                        try {
                            System.out.print("Enter Account Number: ");
                            int accNo = sc.nextInt();

                            System.out.print("Enter Deposit Amount: ");
                            double amt = sc.nextDouble();

                            BankService service = new BankService();
                            double updatedBal = service.deposit(accNo, amt);

                            System.out.println("Amount deposited successfully\nAvailable Balance: "+updatedBal);
                        } 
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    // 4. Withdraw
                    case 4:
                        try {
                            System.out.print("Enter Account Number: ");
                            int accNo = sc.nextInt();

                            System.out.print("Enter Withdraw Amount: ");
                            double amt = sc.nextDouble();

                            BankService service = new BankService();
                            double updatedBal = service.withdraw(accNo, amt);

                            System.out.println("Amount withdrawn successfully\nAvailable Balance: "+updatedBal);
                        } 
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    // 5. Fund Transfer
                    case 5:
                        try {
	                        System.out.print("Enter FROM Account Number: ");
	                        int fromAcc = sc.nextInt();
	
	                        System.out.print("Enter TO Account Number: ");
	                        int toAcc = sc.nextInt();
	
	                        System.out.print("Enter Transfer Amount: ");
	                        double amt = sc.nextDouble();
	
	                        BankService service = new BankService();
	                        boolean status = service.fundTransfer(fromAcc, toAcc, amt);
	
	                        if(status) {
	                        	System.out.println("Fund transfer successful");
	                        }
	                        else {
	                        	System.out.println("Fund transfer failed");
	                        }
                        } 
                        catch (Exception e) {
                        	e.printStackTrace();
                        }
                    break;


                    // 6. Print Transactions
                    case 6:
                        try {
                            System.out.print("Enter Account Number: ");
                            int accNo = sc.nextInt();

                            BankService service = new BankService();
                            service.printTransactions(accNo);
                        } 
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                  // 7. Exit
                    case 7:
                        flag = false;
                        System.out.println("Thank You For Using..");
                        System.out.println("Exiting Application...");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

	}

}