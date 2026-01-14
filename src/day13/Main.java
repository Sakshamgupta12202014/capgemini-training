class A {
    private String name;
    private int age;
    private long contact_number;
    private static double balance;

    A(String name, int age, long contact_number, double balance) {
        this.name = name;
        this.age = age;
        this.contact_number = contact_number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String res = "Name: " + this.name + " , Age: " + this.age + " , contact number: " + this.contact_number + " , balance: " + this.balance;

        return res; 
    }
}
public class Main {
    public static void main(String []args) {
        A a = new A("Saksham gupta" , 21, 9389772204l, 504.4);
        System.out.println(a);
    }
}

