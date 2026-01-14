package src.day3;

import java.util.Scanner;

public class online_course_access {
    static Scanner sc = new Scanner(System.in);

    public static void main(String []args) {
        String paid;
        String has_scholarship;
        String is_course_active = "yes";

        System.out.println("*****Please provide the following details****** ");

        System.out.println("Have you bought the course(answer in yes/no) ? :- ");
        paid = sc.next();

        System.out.println("Do you have any Scholarship(answer in yes/no) ? :- ");
        has_scholarship = sc.next();

        if((paid.trim().equalsIgnoreCase("yes") || has_scholarship.trim().equalsIgnoreCase("yes")) && is_course_active.equalsIgnoreCase("yes")) {
            System.out.println("You are Eligible!");
        }else{
            System.out.println("Sorry!, you are not eligible for this course ");
        }
    }
}
