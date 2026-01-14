public class OverloadingMain {

    public static void main(String[] args) {
        System.out.println("Original main");
        // main(10);
        // main("Hello");
        System.out.println(10 + 20 + "java" + 30 + 20);
        int x = 5;
        System.out.println(x++ + x++ + x++);
        System.out.println(true || false && false);

    }

    public static void main(int a) {
        System.out.println("Overloaded main with int");
    }

    public static void main(String s) {
        System.out.println("Overloaded main with String");
    }
}
