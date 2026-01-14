public class Practice {
    public static void main(String []args){
        // Main m = new Main();
        // Main2 m2 = new Main2();

        // Parent p = new Child("Saksham");

        // p.m1();
        // System.out.println("name : " + p.name);

        int a = 10;
        {
            int a = 20;
            System.out.println("inner block a : " + a);
        }

        System.out.println("outer block a : " + a);
    }    
}

class Main{
    static int id;
    String name;

    static{
        System.out.println("This is static initializer 1");
        // name = "Saksham"; // throws CTE :- non static cannot be referenced from static context 
        // System.out.println("Name is : " + name); 
    }

    Main() {
        System.out.println("This is constructor");
    }

    static {
        id = 101;
        System.out.println("This is static initializer 2");
        System.out.println("Id is : " + id);
    }

    {
        System.out.println("This is instance initializer 1");
        name = "Saksham";
    }

}

class Main2 {
    int id;
    static String name;
    static char favChar;

    {
        System.out.println("This is instance initializer, initializing the data members of the class");
        this.id = 103;

        System.out.println("Trying to initialize the static members of the class inside instance initializer");
        favChar = 'A';
    }

    static {
        System.out.println("This is static initializer, initializing the static members of class");
        name = "Saksham";
    }

    Main2() {
        System.out.println("This is Constructor:  " + this.id + "  " + this.name + "  " + this.favChar);
    }
}


// class Parent{
    
//     private String name;

//     Parent(String name) {
//         System.out.println("Parent class Constructor called");
//         this.name = name;
//     }

// }

// class Child extends Parent {
//     private String name;

//     Child(String parentName, String childName) {
//         super(parentName);
//         System.out.println("Child Class Constructor called");
//         this.name = childName;
//     }

//     Child(String childName) {
//         super(childName);
//         System.out.println("Child Class Constructor called");
//         this.name = childName;
//     }
// }


class Parent{
    
    String name = "mukesh gupta";

    Parent() {
        System.out.println("Parent class Constructor called");
    }

    Parent(String name) {
        System.out.println("Parent class Constructor called");
        this.name = name;
    }

    void m1() {
        System.out.println("parent m1");
    }

}

class Child extends Parent {
    String name = "saksham";

    Child(String childName) {
        System.out.println("Child Class Constructor called");
        this.name = childName;
    }

    void m1() {
        System.out.println("child m1");
    }

    // super() is mandatory when the parent class does not define a no-argument constructor.
}

