
public class RefinedSingleton {
    
    private RefinedSingleton() {}

    private static class RefinedSingletonHelper {
        private static final RefinedSingleton INSTANCE = new RefinedSingleton();
    }

    /**
     * Does not require synchronization; the helper class is not loaded into memory until the getInstance()
     * method is called
     */
    public static RefinedSingleton getInstance() {
        return RefinedSingletonHelper.INSTANCE;
    }

}