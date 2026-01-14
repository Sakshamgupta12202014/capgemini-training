package src;

import java.util.Scanner;

public class AssignmentQ1 {
    public static void main(String []args) {
        // long stock = 9765427845L;
        // String res = stock > 0 ? " Item added to cart " : " item is out of stock ";
        // System.out.println(res);

        // int i = 258;
        // byte b = ( byte ) i;
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n = sc.nextInt();
        String s = sc.nextLine();
        
        System.out.println(n + " String input:- " + s);
        sc.close();
    }

    // Q2 the relational operator <= ensures that the quantity limit is not exceeded

    // Q3 Free delivery eligibility :- the relational operator >= must be used to check Free delivery eligibility

    // Q4 the relational operator ' > ' enforces the given rule , if we use other operators like >= will also include value 2000 but question says that the cart value must be above 2000 the only you will be able to get the special discount
    
    // Q5 

 
}
