import java.util.Scanner;

public class OnlineShopping
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchase_amount = sc.nextDouble();
        System.out.print("customer type: ");
        String customer_type = sc.next();

        System.out.println(shopping(purchase_amount, customer_type));
    }

    static String shopping(double purchase_amount, String customer_type) {
       if(
        purchase_amount < 0 || customer_type.trim().equals("")
       ){
        return "Invalid details, fill the fields correctly";
       }
       else if(purchase_amount > 0 && customer_type.trim().equals("premium")) {
            double net_payable_amount = Math.round((purchase_amount - 0.50 * purchase_amount)*100.0 / 100.0);
            return "Your net payable amount is: " + net_payable_amount;
       }else if(purchase_amount > 0 && customer_type.trim().equals("regular")) {
            double net_payable_amount = purchase_amount - 0.20*purchase_amount;
            return "Your net payable amount is: " + net_payable_amount;
       }else{
            return "Please enter valid purchase amount or customer type";
       }
    }
}