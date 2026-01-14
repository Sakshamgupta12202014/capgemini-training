package src;

import java.util.Scanner;

public class Day2 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a byte value:- ");
        int num = sc.nextByte();

        System.out.println(num);

        int num2 = sc.nextShort();
        System.out.println(num2);

        

        sc.close();
    }
}
