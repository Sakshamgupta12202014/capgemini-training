package src.day3.switch_case;

import java.util.Scanner;

public class movie_rating_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating;
        System.out.println("Movie Rating App");
        rating = sc.nextInt();


        switch (rating) {
            case 1:
                System.out.println("rating:- poor");
                break;
            case 2:
                System.out.println("rating:- average");
                break;
            case 3:
                System.out.println("rating:- good");
                break;
            case 4:
                System.out.println("rating:- Excellent");
                break;
            default:
                System.out.println("Provide a valid rating");
                break;
        }
        sc.close();
    }

}
