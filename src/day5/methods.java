package src.day5;

import java.util.Scanner;

class Calculator
{
    // static Scanner sc = new Scanner(System.in);
    // public static void main(String []args) {
    //     add();
    //     multiply();

    //     sc.close();
    // }

    // public static void add() {
    //     System.out.println("Enter values: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Res: " + (a + b));
    // }

    // public static void substract() {
    //     System.out.println("Enter values: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Res: " + (a - b));
    // }

    // public static void multiply() {
    //     System.out.println("Enter values: ");
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Res: " + (a * b));
    // }

    // Throws Exception --> if you close scanner before calling the next method
    public static void main(String []args) {
        add();
        // multiply();
    }

    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Res: " + (a + b));
        sc.close();

        double d = 23.45;
        int i = 0 + d;
        System.out.println(i);
    }

    public static void substract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Res: " + (a - b));
        sc.close();
    }

    public static void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Res: " + (a * b));
        sc.close();
    }
}