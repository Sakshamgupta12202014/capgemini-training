package src.day3;

import java.util.Scanner;

public class company_bonus_eligibility {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int experience;
        int performance;

        System.out.println("Welcome to company bonus eligiblity Software");

        System.out.println("Enter experience of employee");
        experience = sc.nextInt();

        System.out.println("Enter performance index");
        performance = sc.nextInt();

        if (experience >= 5 && performance >= 4) {
            System.out.println("Employee is eligible for bonus");
        }
    }
}
