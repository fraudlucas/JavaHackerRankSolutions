package java8.advanced.singleton;

public class Singleton {
    private Singleton() {
    }

    public static Singleton instance = new Singleton();
    public static String str = "";

    public static Singleton getSingleInstance() {
        return instance;
    }

}
