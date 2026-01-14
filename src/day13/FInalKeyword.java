public class FinalKeyword {
    public static void main(String []args) {
        // Subclass s = new Subclass();
        // FinalClass f = new FinalClass();

        Demo d = new Demo();
        Demo d2 = new Demo();

        Sample s1 = new Sample();
        s1.setA(10);
        s1.setB(20);
    }

}

class Demo {
    // A final variable cannot be reassigned once it is initialized.
    static final int a;
    final int b;

    static{
        a = 20;
    }

    // {
    //     b = 30;
    // }

    Demo() {
        // this.a = a;
        this.b = 50;
    }

    public static final void method1() {
        System.out.println("This is static final method and it is inherited but cannot be overriden by subclass");
    } 

    // public static final void method1(int b) {
    //     Demo.a = b;
    // }

    public final void method2() {
        System.out.println("This is instance final method and it is inherited but cannot be overriden by subclass");
    }
}

// class Subclass extends Demo {
//     Subclass() {
//         System.out.println("Subclass constructor called");
//         System.out.println("Final variable int: " + super.a);

//         method1();
//         method2();
//     }
// }

// this class cannot be inherited
final class FinalClass {
    static int a;
    int b;

    {
        a = 10;
        b = 20;
    }
    FinalClass() {
        System.out.println("This is final class constructor");
    }
} 




class Sample {
    static final int a;
    final int b;

    Sample() {
        System.out.println("This is constructor");
    }

    static final void setA(int x) {
        a = x;
    }

    final void setB(int y) {
        this.b = y;
    }
}