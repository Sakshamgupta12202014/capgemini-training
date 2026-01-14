import java.util.Scanner
;
import java.util.Arrays
;
public class OddIndxAvg
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int arr[] = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};

        System.out.println(Arrays.toString(arr));
        double sum = 0.0;
        int n= 0;

        for(int i=0; i<arr.length; i++)
        {
            if((i & 1) != 0) {
                sum += arr[i];
                n++;
            }
        }

        System.out.println("Avg of odd indices of arr: " + (sum/n));
    }
}