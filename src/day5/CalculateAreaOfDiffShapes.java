// package src.day5;

import java.util.Scanner;

class CalculateAreaOfDiffShapes
{

    static Scanner sc = new Scanner(System.in);

    public static void main(String []args)
    {
        do {
            System.out.println("Please choose a shape: \n1 ---> Rectangle\n2 ---> Square\n3 ---> Circle");
            System.out.print("Enter your choice:- ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    // cal are of rec
                    areaOfRec();
                    break;
                case 2:
                    // calc area of sq
                    areaOfSq();
                    break;
                case 3:
                    // calc area of circle
                    areaOfCircle();
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
            
            System.out.print("\nDo you want to continue type y for yes / n for no: ");
            String want_to_continue = sc.next();

            if(!want_to_continue.equals("y")) {
                break;
            }else{
                System.out.println("Exiting....");
            }
        }while(true);

       sc.close();
    }

    public static void areaOfRec(){
        System.out.print("Enter the length and breadth of rec: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Area of rectangle: " + (l * b));
    }

    public static void areaOfSq(){
        System.out.print("Enter the side of sq: ");
        double side = sc.nextDouble();

        System.out.print("Area of rectangle: " + (side * side));
    }

    public static void areaOfCircle(){
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        System.out.print("Area of rectangle: " + (22/7 * radius * radius));
    }
}