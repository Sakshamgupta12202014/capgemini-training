package src.day4.practice;

class find_quotient_without_div 
{
    public static void main(String []args) 
    {
        int dividend = 1023;
        int divisor = 12;

        int quotient = 0;
        while(dividend > divisor) 
        {
            quotient++;
            dividend -= divisor;
        }

        System.out.println("Quotient is :- " + quotient);
    }
}