import java.util.Scanner
;
import java.util.Arrays
;
public class Average
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 8 elements space separated: ");
        int arr[] = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(),s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), };

        System.out.println(Arrays.toString(arr));
        double sum = 0.0;

        for(int i=0; i<arr.length/2; i++)
        {
            sum += arr[i];
        }

        System.out.println("Avg of first half arr : " + (sum/(arr.length/2)));
    }
}