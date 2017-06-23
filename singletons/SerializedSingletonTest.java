
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        
        out.writeObject(instanceOne);
        out.close();

        /**
         * Deserialize the object from the file
         */
        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton)in.readObject();
        in.close();

        System.out.println("instanceOne hashcode = " + instanceOne.hashCode());
        System.out.println("instanceTwo hashcode = " + instanceTwo.hashCode());
    }
}