public class DisariumNumber
{
    public static void main(String []args)
    {
        for(int num=10; num<=1000; num++) 
        {
            int number = num;
            int noOfDigits = 0;
            while(number > 0) {
                number /= 10;
                noOfDigits++;
            }
            number = num;
            int sum = 0;

            while(number > 0)
            {
                int dig = number % 10;
                number = number / 10;

                int power = noOfDigits;
                int prod = 1;
                while(power>0) {
                    prod *= dig;
                    power--;
                }
                sum += prod;
                noOfDigits--;
            }

            if(sum == num) {
                System.out.println("Disariam Number: " + num);
            }
        }
    }
}