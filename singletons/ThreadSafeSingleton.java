
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {}

    /**
     * Only one thread can execute this method at a time; it is locked for other threads
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (this.instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return this.instance;
    }
}