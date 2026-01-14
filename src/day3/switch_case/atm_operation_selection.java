package src.day3.switch_case;

import java.util.Scanner;

public class atm_operation_selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:- \n1) Withdraw\n2) Deposit\n3)Balance Enquiry\n4) Exit");

        long balance = 10000l;
        
        
        String account_number = null;
        System.out.println("Enter your account number to continue....");
        account_number = sc.next();

        if(account_number.length() < 11) {
            System.out.println("Enter a valid account number");
            sc.close();
            return;
        }

        int choice;
        System.out.println("Enter your Choice:- ");
        while(true) {
            choice = sc.nextInt();
            boolean exit = false;
            switch (choice) {
                case 1:
                    long amount;
                    System.out.println("Enter the amount to withdrawl");
                    amount = sc.nextLong();
                    if(amount <= balance) {
                        balance -= amount;
                        System.out.println("amount withdrawl successfull\nCurrent balance:- " + balance);
                    }else{
                        System.out.println("Insufficient balance");
                    }
                    break;
                case 2:
                    long deposit_amount;
                    System.out.println("Enter the amount to deposit");
                    deposit_amount = sc.nextLong();

                    if(deposit_amount > 0) {
                        balance += deposit_amount;
                        System.out.println("amount deposit successfull\nCurrent balance:- " + balance);
                    }else{
                        System.out.println("Something Went Wrong");
                    }
                    break;
                case 3:
                    System.out.println("Balance is:- " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }

            if (exit) break;
        }
        sc.close();
    }
}
