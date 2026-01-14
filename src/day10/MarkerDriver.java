public class MarkerDriver
{
    static{
        Marker.name = "Blue";
        System.out.println(Marker.name);  // single copy execution
        Marker.write();
        Marker.collect(new Marker());
        Marker.collect(new Marker());
    }
    public static void main(String []args) {
        Marker.name = "Blue";
        System.out.println(Marker.name);  // single copy execution
        Marker.write();
    }
}