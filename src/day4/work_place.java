package src.day4;

import java.util.Scanner;

public class find_work_place
{
    public static void main(String []args) 
    {
        int age;
        String gender;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :- ");
        age = sc.nextInt();
        System.out.println("Enter your gender:- ");
        gender = sc.next().charAt(0);

        if(gender == "F") {
            System.out.println("The Employee is restricted to work only in urban areas");
        }
        else if(gender == "M" && age > 20 && age < 40) {
            System.out.println("The Employee can work anywhere");
        }
        else if(gender == "M" && age > 40 & age < 60) {
            System.out.println("The Employee is restricted to work only in urban areas");
        }
        else{
            System.out.println("ERROR");
        }

        sc.close();
    }
}