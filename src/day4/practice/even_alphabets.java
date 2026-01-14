package src.day4.practice;

class print_even_alphabets 
{
    public static void main(String []args) 
    {
        char ch = 'a';
        for( ; ch <= 'z' ; ch++) {
            if ( ch % 2 == 0) {
                System.out.print(ch + "  ");
            }
        }
    }
}