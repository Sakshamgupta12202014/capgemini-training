package src.day4.practice;

class print_table 
{
    public static void main(String []args) 
    {
        int num = 12;

        for(int i=1 ; i<=10 ; i++) {
package src.day4.practice;

class sum_even_odd 
{
    public static void main(String []args) 
    {
        int m = 10, n = 50;
        long sum_even = 0;
        long sum_odd = 0;
        for( ; m <= n ; m++) {
            if((m & 1) == 0) {
                sum_even+=m;
            }else{
                sum_odd+=m;
            }
        }

        System.out.println("Sum of even: " + sum_even);
        System.out.println("Sum of odd: " + sum_odd);
    }
}        }
    }
}