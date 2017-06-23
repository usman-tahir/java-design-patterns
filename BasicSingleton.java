
public class BasicSingleton {
    private static final BasicSingleton instance = new BasicSingleton();

    /**
     * Private constructor to avoid client applications using the constructor
     */
    private BasicSingleton() {

    }

    public static BasicSingleton getInstance() {
        return this.instance;
    }
}