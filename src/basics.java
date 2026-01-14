package src;

public class basics {
    public static void main(String[] args) {

        // System.out.print("5 ");
        // System.out.print("25 ");
        // System.out.print("75 ");
        // System.out.print("85 ");
        // System.out.println();
        // System.out.print("25 ");
        // System.out.print("45 ");
        // System.out.print("35 ");
        // System.out.println();
        // System.out.print("15 ");
        // System.out.print("20 ");
        // System.out.println();
        // System.out.println("5 ");

        int a = 10, b = 20, c = 30;
        int largest = a > b ? a > c ? a : c : b > c ? b : c;
        
        int n1 = a > b ? a : b;
        int res = n1 > c ? n1 : c;


        System.out.println(res);

        System.out.println(largest);

        // findArea(4.2);
        // findAreaOfCircle(5);
        // findAreaOfRectangle(3.5, 4.0);
    }

    public static void findArea(double side) {
        System.out.println(side * side);
    }

    public static void findAreaOfCircle(float radius) {
        System.out.println(3.14 * radius * radius);
    }

    public static void findAreaOfRectangle(double length, double breadth) {
        System.out.println(length * breadth);
    }

    // WAP to swap two numbers using 3 variable , and without using 3 variable

    public static void swapUsing3Var(double a, double b) {

        System.out.println("Before swapping:- " + "a = " + a + ", b = " + b);
        double c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("after swapping:- " + "a = " + a + ", b = " + b);
    }

    public static void swapUsingXOR(int a, int b) {
        System.out.println("Before swapping:- " + "a = " + a + ", b = " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swapping:- " + "a = " + a + ", b = " + b);
    }



}


