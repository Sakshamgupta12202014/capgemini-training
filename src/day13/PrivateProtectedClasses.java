
// error: modifier private, protected not allowed here
public class PrivateProtectedClasses {
    public static void main(String []args) {

    }
}

class X {
    /*
    In Java, default access (also called package-private) means:
        No access modifier is written
        The member is accessible only within the same package
        There is no keyword named default for access control.

        Valid access levels in Java are:
            public
            protected
            private
            (default / package-private → no keyword)
     */
    default X() {
        System.out.println("private class constructor called");
    }
}

/*
When private/protected do work:
You can use private and protected for nested/inner classes:
 */
class Outer {
    private class PrivateInner {  // Only Outer can use this
        // ...
    }
    
    protected class ProtectedInner {  // Outer, same package, and subclasses
        // ...
    }
}