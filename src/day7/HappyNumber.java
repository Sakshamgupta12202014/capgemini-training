public class HappyNumber
{
    public static void main(String[] args)
    {
        int st = 1, end = 500;
        int count_of_happy_number = 0;

        for(int num = st; num<=end; num++) {
            int orig_num = num;
            int n = 0;
            while(orig_num > 0) 
            {
                int dig = orig_num % 10;
                orig_num /= 10;
                n += dig*dig;

                if( orig_num == 0 && n > 9){
                    orig_num = n;
                    n = 0;
                }
            }
            if( n == 1) {
                System.out.println("Happy Number: " + num);
                count_of_happy_number++;
            }
        }
        System.out.println("Count of happy numbers: " + count_of_happy_number);
    }
}