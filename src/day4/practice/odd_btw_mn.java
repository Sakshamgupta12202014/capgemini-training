package src.day4.practice;

class print_odd_numbers 
{
    public static void main(String []args) 
    {
        int m = 10, n = 50;
        for( ; m <= n ; m++) {
            if((m & 1) != 0) {
                System.out.print(m + "  ");
            }
        }
    }
}