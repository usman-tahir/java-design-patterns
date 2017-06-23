
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (this.instance == null) {
            instance = new LazySingleton();
        }
        return this.instance;
    }
}