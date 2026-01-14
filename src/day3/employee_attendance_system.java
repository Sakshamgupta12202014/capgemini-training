package src.day3;
import java.util.Scanner;

public class employee_attendance_system {
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args) {
        // use if else strictly
        System.out.println("Please enter working hours of Employee:- ");
        int working_hours = sc.nextInt();

        if( working_hours > 8) {
            System.out.print("Employee is maked as present");
        }
        else if( working_hours >= 4 && working_hours <= 8 ) {
            System.out.print("Employee presence is maked as half-day");
        }
        else {
            System.out.print("Employee is maked as Absent");
        }
    }

}
