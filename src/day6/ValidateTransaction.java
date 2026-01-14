import java.util.Scanner; 

public class ValidateTransaction
{
    public static void main(String []args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balance: ");
        double balance = sc.nextDouble();
        System.out.println("Enter amount to withdrawl");
        double withdraw_amt = sc.nextDouble();

        String result = validate(balance, withdraw_amt);
        System.out.println("\n" + result);
        sc.close();
    }
    
    static String validate(double balance, double withdraw_amt)
    {
        if(balance < withdraw_amt) 
        {
            return "Insufficient balance";
        }
        else
        {
            if(withdraw_amt <= 0) {
                return "Invalid amount withdrawl, amount should be greater than 0";
            }
            else{
                if(balance > 0 && withdraw_amt > 0 && balance > withdraw_amt) {
                    return withdraw_amt + " withdrawn successfully, remaining balance: " + (balance - withdraw_amt);
                } 
            }
        }
        return "";
    }

}