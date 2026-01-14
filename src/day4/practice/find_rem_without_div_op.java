package src.day4.practice;

class find_rem_without_mod 
{
    public static void main(String []args) 
    {
        int dividend = 25;
        int divisor = 12;

        int quotient = 0;
        int d = dividend;
        while(d > divisor) 
        {
            quotient++;
            d -= divisor;
        }

        int remiander = dividend - divisor*quotient;

        System.out.print("Remainder :- " + remiander);
    }
}