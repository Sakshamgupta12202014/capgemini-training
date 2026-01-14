package src.day4;

import java.util.Scanner;

public class discount_calculator
{
    public static void main(String []args) 
    {
        Scanner sc = new Scanner(System.in);
        int quantity;

        System.out.println("Enter the quantity of your purchase:- ");
        quantity = sc.nextInt();

        long total_purchase = quantity * 100;

        if(total_purchase > 1000) {
            System.out.println("You got discount ,Total cost :- " + 0.9 * total_purchase);
        }
        else{
            System.out.println("Your total cost of purchase is :- " + total_purchase);
        }
        sc.close();
    }
}