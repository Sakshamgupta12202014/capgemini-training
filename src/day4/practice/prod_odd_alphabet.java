package src.day4.practice;

class prod_odd_alpha 
{
    public static void main(String []args) 
    {
        char ch = 'a';
        double prod = 1;

        for( ; ch <= 'z' ; ch++) {
            if ( ch % 2 != 0) {
                System.out.print(ch + "  ");
                prod *= ch;
            }
        }
        System.out.print("prod is :- " + prod);
    }
}