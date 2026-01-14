public class arrays
{
    // int a;
    public static void main(String []args) 
    {
        // int a;
        // arrays obj = new arrays();
        // System.out.println("This is global variable: " + a);

        //Arrays are objects in java 

        // ways of declaring and initializing an array
        int arr[] = {12,34,56,56};

        int []arr2 = {23,4,6,7};
        
        // CTE: error: not a statement
        int arr1[];
        arr1[] = {10, 20, 30, 40};

        int size = 10;
        int arr3[] = new int[size];

        // Use this type of array declaration when you want the user to initialize the array
        int arr4[] = new int[]{10, 20, 30, 40, 50};

        // CTE: array creation with both dimension expression and initialization is ilegal
        int arr5[] = new int[5]{};

        
    }
}