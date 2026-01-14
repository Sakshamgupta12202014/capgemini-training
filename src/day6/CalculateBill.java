import java.util.Scanner;

public class CalculateBill
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Current meter reading: ");
        double curr_reading = sc.nextDouble();
        System.out.print("Enter the Previous meter reading: ");
        double last_reading = sc.nextDouble();

        double unit_rate = 4.50;
        String result = calculate(curr_reading, last_reading, unit_rate);
        System.out.println(result);
    }

    static String calculate(double curr_reading, double last_reading, double rate) {
        if(curr_reading < last_reading) {
            return "Invalid readings !";
        }
        else{
            if(
                curr_reading == last_reading
            ){
                return "Your Electricity bill: Rs. 0"; 
            }

            else if(curr_reading > 0 && last_reading > 0 && curr_reading > last_reading) {
                double units_consumed = curr_reading - last_reading;
                double bill = units_consumed * rate;

                return "Your Electricity bill: " + bill;
            }
        }

        return "Enter correct readings";
    }
}