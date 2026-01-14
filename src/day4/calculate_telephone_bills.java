package src.day4;

import java.util.Scanner;

class calculate_telephone_bills
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of calls taken this month: ");
        int calls = sc.nextInt();

        double totalMinimumBill = 200.0;

        if(calls <= 100) {
            System.out.println("Your telephonic bill amount will be Rs " + totalMinimumBill);
        }
        else if (calls > 100 && calls <= 200){
            int extraCalls = calls - 100;
            if(extraCalls <= 50) {
                totalMinimumBill += (0.6 * extraCalls); 
            }
            else {
                totalMinimumBill += (0.6 * 50);
                totalMinimumBill += (0.5 * (extraCalls - 50));
            }
            System.out.println("Your telephonic bill amount will be Rs " + totalMinimumBill);
        }
        else {
            int extraCalls = calls - 100;
            totalMinimumBill += (0.6 * 50);
            totalMinimumBill += (0.5 * 50);
            totalMinimumBill += (0.4 * (extraCalls - 100));
            System.out.println("Your telephonic bill amount will be Rs " + totalMinimumBill);
        }

        sc.close();
    }
}
