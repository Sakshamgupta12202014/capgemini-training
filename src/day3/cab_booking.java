package src.day3;
import java.util.Scanner;

public class cab_booking {

    static Scanner sc = new Scanner(System.in);
    public static void main(String []args) {
        String location;
        boolean is_driver_available = true;
        String payment_mode;

        System.out.print("Please Enter your location(Serviceable locations are (Bisauli, Chandausi, budaun)):- ");
        location = sc.next();

        boolean is_location_serviceable = true;

        System.out.println("Please select your payment mode-----------------");
        System.out.println("Choose 1:- Cash\nChoose 2:- UPI\nChoose 3:- Cards(Debit card/ Credit cards)");
        int choice;
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                payment_mode = "Cash";
                break;
            case 2:
                payment_mode = "UPI";
                break;
            case 3:
                payment_mode = "Cards";
                break;
            default:
                payment_mode = "";
                break;
        }

        if(is_driver_available && is_location_serviceable && payment_mode != null) {
            System.out.println("Your Cab is Successfully booked\n**Click to Track Your Cab**");
        }
        else{
            System.out.println("Sorry for inconvenience, we do not provide service in the area");
        }

    }
}
