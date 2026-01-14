package src.day4;

import java.util.Scanner;

class rev_num {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter a number");
        number = sc.nextInt();

        int rev_num = 0;

        while(number > 0)
        {
            int lastDig = number % 10;
            number /= 10;
            rev_num = rev_num * 10 + lastDig;
        }

        System.out.println("Reversed number:- " + rev_num);
    }
}