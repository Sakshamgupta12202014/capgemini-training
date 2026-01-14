public class Marker
{
    static String name;

    static void write() {
        System.out.println("Write on dashboard");
    }
    static void collect(Marker m)
    {
      System.out.println(m);
    }
    static {
        System.out.println("Shop");
    }
}