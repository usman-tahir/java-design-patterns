
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    /**
     * Static block initialization used for exception handling
     */
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("An exception occurred in creating a Singleton instance.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return this.instance;
    }
}