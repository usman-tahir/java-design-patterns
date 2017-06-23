
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500GB", "2GB").setBluetoothEnabledStatus(true).setGraphicsCardEnabledStatus(true).build();

        System.out.println(computer.toString());
    }
}