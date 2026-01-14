import java.util.Scanner;

public class Initializers {
    public static void main(String []args) {
        Y obj = new Y();
        System.out.println(obj.getA());
    }
}

class Y {
    static private int a;
    int b;

    static {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = s.nextInt();
        // s.close();
    }

    {
        // non static initializer
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of b: ");
        b = sc.nextInt();
    }

    Y() {
        System.out.println("This is constructor");
    }

    public int getA() {
        return a;
    }
}