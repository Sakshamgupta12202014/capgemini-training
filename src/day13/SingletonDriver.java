public class SingletonDriver {
    public static void main(String []args) {
        // Singleton s = new Singleton("101"); //SingletonDriver.java:3: error: Singleton(String) has private access in Singleton

        Singleton singletonObjRef = Singleton.helperMethod();
        System.out.println("Object ref of singleton class: " + singletonObjRef);

        Singleton singletonObjRef2 = Singleton.helperMethod();
        System.out.println("Object ref of singleton class: " + singletonObjRef2);
    }
}

class Singleton {
    private String id;
    private static Singleton instance;

    private Singleton(String id) {
        System.out.println("Private constructor called");
        this.id = id;
    }

    public static Singleton helperMethod() {
        if(instance == null) {
            instance = new Singleton("101");
        }

        return instance;
    }
}


