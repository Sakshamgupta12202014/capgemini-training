package src.day3;

import java.util.Scanner;

public class bank_status_check {

    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {
        double minimum_balance = 1000.0d;

        double current_balance;
        System.out.println("Please enter your current balance:- ");
        current_balance = sc.nextDouble();

        if(current_balance >= minimum_balance){
            System.out.println("Congrats!, Your account is Active");
        }else if(current_balance < minimum_balance) {
            System.out.println("Low balance!, please maintain minimum balance");
        }else{
            System.out.println("Bank has temporarily blocked outgoing transactions like withdrawals, transfers, and bill payments");
        }
    }
}
