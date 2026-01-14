package src.day3;

import java.util.Scanner;
public class shopping_card_validation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String []args) {
        long items_in_cart;
        String delivery_address;

        System.out.println("Enter the number of items in cart:- ");
        items_in_cart = sc.nextLong();

        if(items_in_cart <= 0) {
            System.out.println("Add Some items in cart");
            return;
        }

        System.out.println("Enter the delivery address:- ");
        delivery_address = sc.next();

        if(items_in_cart > 0 && !delivery_address.trim().equals("")) {
            System.out.println("Your order is confirmed");
        }
        else{
            System.out.println("Add Something into the cart OR enter a valid delivery address");
        }
    }
}
