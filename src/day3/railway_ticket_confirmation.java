package src.day3;

import java.util.Scanner;

public class railway_ticket_confirmation {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int available_confirm_seats = 0;
        int available_RAC_seats = 200;

        int no_of_seats;
        System.out.println("Enter the number of seats you want to book:- ");
        no_of_seats = sc.nextInt();

        if (available_confirm_seats > 0) {
            if (no_of_seats <= available_confirm_seats) {
                System.out.println("Hurray!, Your " + no_of_seats + " seats are confirmed");
                available_confirm_seats -= no_of_seats;

                System.out.println("Avaialable confirm seats now are:- " + available_confirm_seats);
            } else {
                System.out.println("limited seats are available");
                String book;
                System.out.println("Do you still want to book? (answer in yes/no)");

                book = sc.next();
                if (book.equalsIgnoreCase("yes")) {

                    System.out.println("Confirmed seats:- " + (no_of_seats - (no_of_seats - available_confirm_seats)));
                    System.out.println("Waitlisted seats:- " + (no_of_seats - available_confirm_seats));
                    available_confirm_seats = 0;
                }
            }
        } else if (available_confirm_seats == 0) {
            System.out.println("Confirmed seats are not available, Do you want to book RAC seats?(yes/no)");
            String book;
            System.out.println("Do you want to book RAC tickets? (answer in yes/no)");
            book = sc.next();

            if (book.equalsIgnoreCase("yes")) {
                if (available_RAC_seats >= no_of_seats) {
                    System.out.println("Your seats are booked in RAC");
                    available_RAC_seats -= no_of_seats;

                    System.out.println("Avaialable RAC seats now are:- " + available_RAC_seats);
                } else {
                    System.out.println("Sorry!, tickets cannot be booked");
                }
            }
        }
    }
}
