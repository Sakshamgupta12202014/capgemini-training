import java.util.Scanner;

public class LoanEligibilityChecker
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cibil Score: ");
        int cibil_score = sc.nextInt();

        System.out.print("Enter your monthly income: ");
        double monthly_income = sc.nextDouble();

        System.out.print("Loan amount needed: ");
        double loan_amount = sc.nextDouble();

        System.out.print("Enter your no of active loans: ");
        int no_of_active_loans = sc.nextInt();


        int i=1;
        while(i<=no_of_active_loans)
        {
            System.out.print("Enter the emi of loan " + i + ": ");
            double emi = sc.nextDouble();

            if(emi <= 0){
                System.out.println("Enter valid emi amount for loan");
                continue;
            }

            monthly_income -= emi;
            i++;
        }

        System.out.print("Enter the loan tenure: ");
        int tenure = sc.nextInt();
        String result = checkLoanEligibility(cibil_score, loan_amount, monthly_income, tenure);
        System.out.println(result);

        sc.close();
    }

    public static String checkLoanEligibility(int cibil_score, double loan_amount, double monthly_income, int tenure)
    {
        if(cibil_score >= 550){
            
            double max_loan_allowed = (monthly_income * 12) * 0.7;
            if(max_loan_allowed < loan_amount) return "You can have a max loan of Rs. " + max_loan_allowed + " you are not eligible for loan";
            double emi_per_month = loan_amount / (tenure * 12);

            if(emi_per_month >= monthly_income) {
                return "Emi does not fit in your monthly income, you are not eligible for loan";
            }

            return "You are eligible for laon\nDetails:Your per month loan emi is \nEMI: " + emi_per_month + "\nTenure: " + tenure;

        }
        else{
            return "Your cibil score is low, you are not eligible for loan";
        }
    }
}