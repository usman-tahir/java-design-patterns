
import java.lang.reflect.Constructor;

public class ReflectionSingleton {
    public static void main(String[] args) {
        BasicSingleton instanceOne = BasicSingleton.getInstance();
        BasicSingleton instanceTwo = null;

        try {
            Constructor[] constructors = BasicSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                // This code snippet will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (BasicSingleton)constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}