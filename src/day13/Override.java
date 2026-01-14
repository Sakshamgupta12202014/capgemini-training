/*
        General Rule (Java)

        When a method is overridden in a subclass:

            *) Method name must be the same

            *) Parameter list must be the same

            *) Return type must be the same or covariant

            *) Access level cannot be reduced

        If the return type is incompatible, compile-time error occurs.

 */

public class Override {
    public static void main(String []args) {
        def obj = new def();
        obj.getInfo();

        // String res = obj.printDetails();
        // System.out.println(res);

        StringBuilder res = obj.printDetails();
        System.out.println(res);

        // StringBuffer res = obj.printDetails();
        // System.out.println(res);
    }
}

class abc {
    void getInfo() {
        System.out.println("This is abc class method");
    }

    // Covariant Return Type (Allowed Case) :- Since Java 5, a subclass is allowed to return a more specific type than the superclass method.
    // covariant return type :- The return type of the overridden method can be a subclass of the original return type.
    Object printDetails() {
        System.out.println("This is abc class method");
        return new Object();
    }

    // reverse of covariant ret type is not valid 
    String displayDetails() {
        return "Reverse of it throws compile time error ";
    }

    void printAge() {
        System.out.println("Age is 23");
    }
}

class def extends abc {
    void getInfo() {
        System.out.println("This is def class method overriding abc class method");
    }

    // StringBuilder is the sub class of Object return type of super class method
    StringBuilder printDetails() {
        System.out.println("This is def class method overriding abc class method");
        return null;
    }

    // StringBuffer printDetails() {
    //     System.out.println("This is def class method overriding abc class method");
    //     return null;
    // }

    // Object displayDetails() {
    //     return new Object();
    // }


    /*      void Return Type
            If the superclass method returns void, the subclass must also return void.
    */ You cannot change void to any other type or vice versa.
    void printAge() {
        System.out.println("Age is 25");
    }
}