public class Test
{
    public static void main(String []args)
    {
        int a = 10;
        double b = 20.03;
        double res = a + b;

        System.out.println(res);
        // m1(m3(100), 200);
    }
    public static void m1(int x, int a){
        System.out.println("m1() -> " + a);
        System.out.print("m3() -> " + x);
    }
    public static int m2() {
        System.out.println("m2() -> ");
        return 10;
    }

    public static void m3(int a) {
        System.out.println("m3() -> " + a);
        // return a;
    }
}