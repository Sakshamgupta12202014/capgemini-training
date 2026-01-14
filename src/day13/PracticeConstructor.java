public class PracticeConstructor {
    public static void main(String []args) {
        Demo d = new Demo("Saksham gupta");

        // Demo2 d2 = new Demo2();   //error: Demo2() has private access in Demo2
        // Demo2 d2 = new Demo("Saksham");   // error: incompatible types: Demo cannot be converted to Demo2
    }
}


class Demo {
    private String name;

    protected Demo(String name) {
        System.out.println("Constructor with protected access modifier is called");
        this.name = name;
    }
}

class Demo2 {

    private Demo2() {
        System.out.println("This is private constructor ");
    }
}