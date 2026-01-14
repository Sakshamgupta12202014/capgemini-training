package src.day3.switch_case;

import java.util.Scanner;

public class work_schedule {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int day;
        System.out.println("Enter the day number");
        day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekday");
                break;
            case 3:
                System.out.println("Weekday");
                break;
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
                System.out.println("Weekend");
                break;
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Enter a valid day number");
                break;
        }
    }    
}
