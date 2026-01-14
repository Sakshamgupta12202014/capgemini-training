package src.day4;

import java.util.Scanner;

public class find_leap_year
{
    public static void main(String []args) 
    {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:- ");
        year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year ");
        }
        else if(year % 400 == 0) {
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("please enter ome valid year");
        }
        sc.close();
    }
}