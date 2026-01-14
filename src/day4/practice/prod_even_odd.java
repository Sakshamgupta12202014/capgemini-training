package src.day4.practice;

class prod_even_odd 
{
    public static void main(String []args) 
    {
        int m = 10, n = 50;
        long prod_even = 1;
        long prod_odd = 1;
        for( ; m <= n ; m++) {
            if((m & 1) == 0) {
                prod_even*=m;
            }else{
                prod_odd*=m;
            }
        }

        System.out.println("prod of even: " + prod_even);
        System.out.println("prod of odd: " + prod_odd);
    }
}