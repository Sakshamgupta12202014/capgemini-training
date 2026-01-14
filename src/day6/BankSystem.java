import java.util.Scanner;

public class BankSystem
{
    public static void main(String []args) {   
        Scanner sc = new Scanner(System.in);
        double balance = 103974;

        boolean exit = true;
        do {
            System.out.println("Welcome to banking system: \n1 --> Display details\n2 --> Withdraw\n3 --> Deposit\n4 --> Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    display();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if(withdraw(amount, balance)){
                        System.out.println("Withdrawn successfull");
                    }else{
                        System.out.println("Something went wrong, try again later");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double amount_deposit = sc.nextDouble();
                    if(deposit(amount_deposit, balance)){
                        System.out.println("Deposit successfull");
                    }else{
                        System.out.println("Something went wrong while depositing");
                    }
                    break;
                case 4:
                    exit = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Enter a valid choice!!");
            }
        }while(exit);

    }

    public static boolean withdraw(double withdraw_amount, double balance) {
        if(balance > 0 && withdraw_amount > 0) {
            if(withdraw_amount < balance) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void display() {
        System.out.println("Details of your account\nAccount Number: 103847392821\nBalance: 123434\nLoan Info: you have 3 pending EMI's");
    }

    public static boolean deposit(double amount, double balance) {
        if(amount > 0)
        {
            return true;
        }
        else{
            return false;
        }
    } 
}