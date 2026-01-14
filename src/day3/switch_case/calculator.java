package src.day3.switch_case;

import java.util.Scanner;

public class calculator {

    static Scanner sc = new Scanner(System.in);
    public static void main(String []args) {
        double opr1, opr2;
        System.out.println("Enter the value of 1 and 2 variable:- ");
        opr1 = sc.nextDouble();
        opr2 = sc.nextDouble();

        int operation;
        System.out.println("Which operation you want to perform\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
        operation = sc.nextInt();

        double result = 0.0d;
        switch(operation) {
            case 1:
                result = opr1 + opr2;
                break;
            case 2:
                result = opr1 - opr2;
                break;
            case 3:
                result = opr1 * opr2;
                break;
            case 4:
                result = opr1 / opr2;
                break;
        }
        System.out.println("Result:- " + result);
    }    
}
